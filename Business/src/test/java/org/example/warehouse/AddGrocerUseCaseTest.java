package org.example.warehouse;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import org.example.warehouse.commands.AddGrocer;
import org.example.warehouse.events.GrocerAdded;
import org.example.warehouse.values.PersonalData;
import org.example.warehouse.values.WarehouseId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Esta clase representa el test de Agegar Bodeguero
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
@ExtendWith(MockitoExtension.class)
class AddGrocerUseCaseTest {

    @InjectMocks
    private AddGrocerUseCase useCase;

    // Inyección del repositorio
    @Mock
    private DomainEventRepository repository;

    @Test
    void addGrocerHappyPass(){
        //arrange

        WarehouseId warehouseId = WarehouseId.of("rrrr");
        PersonalData personalData = new PersonalData("Pepito", "Perez", "pepitoperez12@gmail.com");
        var command = new AddGrocer(warehouseId, personalData);

        //act

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getWarehouseId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert

        var event = (GrocerAdded)events.get(0);
        Assertions.assertEquals("Pepito", event.getPersonalData().value().name());
        Assertions.assertEquals("Perez", event.getPersonalData().value().lastName());
        Assertions.assertEquals("pepitoperez12@gmail.com", event.getPersonalData().value().email());
    }

}