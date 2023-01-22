package org.example.rack;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.rack.commands.UpdateLoadCapacity;
/**
 * Esta clase representa el caso de uso de Actualizar Capacidad de Carga
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class UpdateLoadCapacityUseCase extends UseCase<RequestCommand<UpdateLoadCapacity>, ResponseEvents> {
    /**
     * Representa el metodo que ejecuta un caso de uso
     * @param updateLoadCapacityRequestCommand
     */
    @Override
    public void executeUseCase(RequestCommand<UpdateLoadCapacity> updateLoadCapacityRequestCommand) {
        var command = updateLoadCapacityRequestCommand.getCommand();

        var rack = Rack.from(command.getRackId(), repository().getEventsBy(command.getRackId().value()));

        rack.updateLoadCapacity(command.getRackId(), command.getLoadCapicity());

        emit().onResponse(new ResponseEvents(rack.getUncommittedChanges()));
    }
}
