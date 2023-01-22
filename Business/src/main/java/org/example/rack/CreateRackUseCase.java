package org.example.rack;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.rack.commands.CreateRack;

/**
 * Esta clase representa el caso de uso de Crear Rack
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class CreateRackUseCase extends UseCase<RequestCommand<CreateRack>, ResponseEvents> {
    /**
     * Representa el metodo que ejecuta un caso de uso
     * @param createRackRequestCommand
     */
    @Override
    public void executeUseCase(RequestCommand<CreateRack> createRackRequestCommand) {
        var command = createRackRequestCommand.getCommand();

        var rack = new Rack(command.getRackId(), command.getCapacidadCarga());

        emit().onResponse(new ResponseEvents(rack.getUncommittedChanges()));
    }
}
