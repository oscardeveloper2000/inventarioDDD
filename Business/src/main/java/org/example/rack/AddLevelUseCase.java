package org.example.rack;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.rack.commands.AddLevel;

/**
 * Esta clase representa el caso de uso de Agreagar Nivel
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class AddLevelUseCase extends UseCase<RequestCommand<AddLevel>, ResponseEvents> {
    /**
     * Representa el metodo que ejecuta un caso de uso
     * @param addLevelRequestCommand
     */
    @Override
    public void executeUseCase(RequestCommand<AddLevel> addLevelRequestCommand) {
        var command = addLevelRequestCommand.getCommand();
        var rack = Rack.from(command.getRackId(), repository().getEventsBy(command.getRackId().value()));
        rack.addLevel(command.getState(), command.getReference());

        emit().onResponse(new ResponseEvents(rack.getUncommittedChanges()));

    }
}

