package org.example;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import org.example.rack.commands.CreateRack;
import org.example.rack.events.RackCreated;
import org.example.rack.values.LoadCapicity;
import org.example.rack.values.RackId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CreateRackUseCaseTest {

    @InjectMocks
    private CreateRackUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void createRackHappyPass(){
        //arrange

        RackId rackId = RackId.of("ffff");
        LoadCapicity loadCapicity = new LoadCapicity(10);
        var command = new CreateRack(rackId, loadCapicity);

        //act

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getRackId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //asserts

        var event = (RackCreated)events.get(0);
        Assertions.assertEquals(10,event.getLoadCapicity().value());
    }
}