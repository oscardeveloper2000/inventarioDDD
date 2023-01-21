package org.example.product;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import org.example.product.commands.AddLot;
import org.example.product.commands.AddPackaging;
import org.example.product.events.LotAdded;
import org.example.product.events.PackagingAdded;
import org.example.product.values.Capacity;
import org.example.product.values.Date;
import org.example.product.values.Dimension;
import org.example.product.values.ProductId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AddPackagingUseCaseTest {

    @InjectMocks
    private AddPackagingUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void addPackagingHappyPass(){

        //arrange

        ProductId productId = ProductId.of("AAA20");
        Capacity capacity = new Capacity(10);
        Dimension dimension = new Dimension(2,2,3);
        var command = new AddPackaging(productId, capacity, dimension);

        //act

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getProductId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert

        var event = (PackagingAdded)events.get(0);
        Assertions.assertEquals(10,event.getCapacity().value());
        Assertions.assertEquals(2, event.getDimension().value().width());
        Assertions.assertEquals(2, event.getDimension().value().length());
        Assertions.assertEquals(3, event.getDimension().value().height());


    }
}