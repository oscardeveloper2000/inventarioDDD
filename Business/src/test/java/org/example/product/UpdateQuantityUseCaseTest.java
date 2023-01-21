package org.example.product;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.product.commands.UpdateQuantity;
import org.example.product.events.ProductCreated;
import org.example.product.events.QuantityUpdated;
import org.example.product.values.ProductId;
import org.example.product.values.Quantity;
import org.example.rack.events.RackCreated;
import org.example.rack.values.LoadCapicity;
import org.example.rack.values.RackId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UpdateQuantityUseCaseTest {

    @InjectMocks
    private UpdateQuantityUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void updateQuantityHappyPass(){
        //arrange

        var command = new UpdateQuantity(ProductId.of("AAA20"),
                Quantity.of(20));

        when(repository.getEventsBy("AAA20")).thenReturn(history());
        useCase.addRepository(repository);

        //act

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getProductId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert

        var quantity = (QuantityUpdated)events.get(0);
        Assertions.assertEquals(20, quantity.getQuantity().value());
    }

    private List<DomainEvent> history(){
        var quantity = Quantity.of(10);
        var event = new ProductCreated(quantity);
        event.setAggregateRootId("AAA20");
        return List.of(event);
    }

}