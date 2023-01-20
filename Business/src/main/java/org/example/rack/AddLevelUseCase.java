package org.example;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.rack.commands.AddLevel;
import org.example.rack.Rack;

public class AddLevelUseCase extends UseCase<RequestCommand<AddLevel>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddLevel> addLevelRequestCommand) {
        var command = addLevelRequestCommand.getCommand();
        var rack = Rack.from(command.getRackId(), repository().getEventsBy(command.getRackId().value()));
        rack.addLevel(command.getState(), command.getReference());

        emit().onResponse(new ResponseEvents(rack.getUncommittedChanges()));

    }
}

