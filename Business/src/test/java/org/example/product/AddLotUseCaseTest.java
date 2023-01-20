package org.example.product;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import org.example.product.commands.AddLot;
import org.example.product.events.LotAdded;
import org.example.product.values.Date;
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
class AddLotUseCaseTest {

    @InjectMocks
    private AddLotUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void addLotHappyPass(){
        //arrange

        ProductId productId = ProductId.of("AAA20");
        Date date = new Date(LocalDate.now(),LocalDate.now().plus(30, ChronoUnit.DAYS));
        var command = new AddLot(productId, date);

        //act

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getProductId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert

        var event = (LotAdded)events.get(0);
        Assertions.assertEquals(date,event.getDate().value());
    }

}