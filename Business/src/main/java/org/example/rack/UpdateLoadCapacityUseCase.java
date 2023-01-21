package org.example.rack;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.rack.commands.UpdateLoadCapacity;

public class UpdateLoadCapacityUseCase extends UseCase<RequestCommand<UpdateLoadCapacity>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateLoadCapacity> updateLoadCapacityRequestCommand) {
        var command = updateLoadCapacityRequestCommand.getCommand();

        var rack = Rack.from(command.getRackId(), repository().getEventsBy(command.getRackId().value()));

        rack.updateLoadCapacity(command.getRackId(), command.getLoadCapicity());

        emit().onResponse(new ResponseEvents(rack.getUncommittedChanges()));
    }
}
