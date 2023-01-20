package org.example.rack;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.rack.Rack;
import org.example.rack.commands.AddSection;
import org.example.rack.entities.Section;

public class AddSectionUseCase  extends UseCase<RequestCommand<AddSection>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddSection> addSectionRequestCommand) {
        var command = addSectionRequestCommand.getCommand();
        var rack = Rack.from(command.getRackId(), repository().getEventsBy(command.getRackId().value()));
        rack.addSection(command.getState(), command.getReference());

        emit().onResponse(new ResponseEvents(rack.getUncommittedChanges()));
    }
}
