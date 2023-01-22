package org.example.rack;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.rack.Rack;
import org.example.rack.commands.AddSection;
import org.example.rack.entities.Section;
/**
 * Esta clase representa el caso de uso de Agreagar Seccion
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class AddSectionUseCase  extends UseCase<RequestCommand<AddSection>, ResponseEvents> {
    /**
     * Representa el metodo que ejecuta un caso de uso
     * @param addSectionRequestCommand
     */
    @Override
    public void executeUseCase(RequestCommand<AddSection> addSectionRequestCommand) {
        var command = addSectionRequestCommand.getCommand();
        var rack = Rack.from(command.getRackId(), repository().getEventsBy(command.getRackId().value()));
        rack.addSection(command.getState(), command.getReference());

        emit().onResponse(new ResponseEvents(rack.getUncommittedChanges()));
    }
}
