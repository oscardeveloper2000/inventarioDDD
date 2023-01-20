package org.example;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.rack.Rack;
import org.example.rack.commands.CreateRack;


public class CreateRackUseCase extends UseCase<RequestCommand<CreateRack>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CreateRack> createRackRequestCommand) {
        var command = createRackRequestCommand.getCommand();

        var rack = new Rack(command.getRackId(), command.getCapacidadCarga());

        emit().onResponse(new ResponseEvents(rack.getUncommittedChanges()));
    }
}
