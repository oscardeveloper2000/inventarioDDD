package org.example.rack;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import org.example.rack.commands.AddLevel;
import org.example.rack.events.LevelAdded;
import org.example.rack.values.RackId;
import org.example.rack.values.Reference;
import org.example.rack.values.State;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Esta clase representa el test de Agegar Nivel
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
@ExtendWith(MockitoExtension.class)
class AddLevelUseCaseTest {

    @InjectMocks
    private AddLevelUseCase useCase;

    // Inyección del repositorio
    @Mock
    private DomainEventRepository repository;

    @Test
    void addLevelHappyPass(){
        //arrange

        RackId rackId = RackId.of("ffff");
        Reference reference = new Reference("Fila 4");
        State state = new State("Disponible");
        var command = new AddLevel(rackId, state, reference);

        //act

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getRackId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert

        var event = (LevelAdded)events.get(0);
        Assertions.assertEquals("Fila 4", event.getReference().value());
        Assertions.assertEquals("Disponible", event.getState().value());

    }

}