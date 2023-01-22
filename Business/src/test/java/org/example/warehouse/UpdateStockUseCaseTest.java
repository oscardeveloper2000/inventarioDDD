package org.example.warehouse;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.warehouse.commands.UpdateStock;
import org.example.warehouse.events.StockUpdated;
import org.example.warehouse.events.WarehouseCreated;
import org.example.warehouse.values.Stock;
import org.example.warehouse.values.WarehouseId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;
/**
 * Esta clase representa el test de Actualizar Stock
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
@ExtendWith(MockitoExtension.class)
class UpdateStockUseCaseTest {
    // Inyección del caso de uso
    @InjectMocks
    private UpdateStockUseCase useCase;
    // Inyección del repositorio
    @Mock
    private DomainEventRepository repository;

    @Test
    void updateStockHappyPass(){
        //arrange

        var command = new UpdateStock(WarehouseId.of("rrrr"),
                Stock.of("500", "Disponible", 0));

        when(repository.getEventsBy("rrrr")).thenReturn(history());
        useCase.addRepository(repository);

        //act

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getWarehouseId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert

        var stock = (StockUpdated)events.get(0);
        Assertions.assertEquals("500", stock.getStock().value().capacity());
        Assertions.assertEquals("Disponible", stock.getStock().value().status());
        Assertions.assertEquals(0, stock.getStock().value().quantity());

    }

    private List<DomainEvent> history(){
        var stock = Stock.of("500","No Disponible",20);
        var event = new WarehouseCreated(stock);
        event.setAggregateRootId("rrrr");
        return List.of(event);
    }
}