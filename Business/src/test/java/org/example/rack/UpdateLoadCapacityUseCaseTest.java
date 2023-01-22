package org.example.rack;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.rack.commands.UpdateLoadCapacity;
import org.example.rack.events.LoadCapacityUpdated;
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
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Esta clase representa el test de Actualizar Capaciad de Carga
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
@ExtendWith(MockitoExtension.class)
class UpdateLoadCapacityUseCaseTest {

    @InjectMocks
    private UpdateLoadCapacityUseCase useCase;

    // Inyección del repositorio
    @Mock
    private DomainEventRepository repository;

    @Test
    void updateLoadCapacityHappyPass(){
        //arrange

        var command = new UpdateLoadCapacity(RackId.of("ffff"),
                LoadCapicity.of(10));

        when(repository.getEventsBy("ffff")).thenReturn(history());
        useCase.addRepository(repository);

        //act

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getRackId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert

        var loadCapacity = (LoadCapacityUpdated)events.get(0);
        Assertions.assertEquals(10, loadCapacity.getLoadCapicity().value());
    }

    private List<DomainEvent> history(){
        var loadCapacity = LoadCapicity.of(20);
        var event = new RackCreated(loadCapacity);
        event.setAggregateRootId("ffff");
        return List.of(event);
    }
}