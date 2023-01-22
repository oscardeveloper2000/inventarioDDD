package org.example.warehouse;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import org.example.warehouse.commands.CreateWarehouse;
import org.example.warehouse.events.WarehouseCreated;
import org.example.warehouse.values.Stock;
import org.example.warehouse.values.WarehouseId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Esta clase representa el test de Crear Bodega
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
@ExtendWith(MockitoExtension.class)
class CreateWarehouseUseCaseTest {

    @InjectMocks
    private CreateWarehouseUseCase useCase;

    // Inyección del repositorio
    @Mock
    private DomainEventRepository repository;

    @Test
    void createWarehouseHappyPass() {
        //arrange

        WarehouseId warehouseId = WarehouseId.of("rrrr");
        Stock stock = new Stock("500", "Disponible", 25);
        var command = new CreateWarehouse(warehouseId, stock);

        //act

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getWarehouseId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert

        var event = (WarehouseCreated)events.get(0);
        Assertions.assertEquals("500", event.getStock().value().capacity());
        Assertions.assertEquals("Disponible", event.getStock().value().status());
        Assertions.assertEquals(25, event.getStock().value().quantity());
    }
}