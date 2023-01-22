package org.example.warehouse;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.warehouse.commands.CreateWarehouse;
/**
 * Esta clase representa el caso de uso de Crear Bodega
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class CreateWarehouseUseCase extends UseCase<RequestCommand<CreateWarehouse>, ResponseEvents> {
    /**
     * Representa el metodo que ejecuta un caso de uso
     * @param createWarehouseRequestCommand
     */
    @Override
    public void executeUseCase(RequestCommand<CreateWarehouse> createWarehouseRequestCommand) {
        var command = createWarehouseRequestCommand.getCommand();

        var warehouse = new Warehouse(command.getWarehouseId(), command.getStock());

        emit().onResponse(new ResponseEvents(warehouse.getUncommittedChanges()));
    }

}
