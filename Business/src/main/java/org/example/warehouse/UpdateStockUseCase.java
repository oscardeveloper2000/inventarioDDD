package org.example.warehouse;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.warehouse.commands.UpdateStock;
/**
 * Esta clase representa el caso de uso de Actualizar Stock
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class UpdateStockUseCase extends UseCase<RequestCommand<UpdateStock>, ResponseEvents> {
    /**
     * Representa el metodo que ejecuta un caso de uso
     * @param updateStockRequestCommand
     */
    @Override
    public void executeUseCase(RequestCommand<UpdateStock> updateStockRequestCommand) {
        var command = updateStockRequestCommand.getCommand();

        var warehouse = Warehouse.from(command.getWarehouseId(), repository().getEventsBy(command.getWarehouseId().value()));

        warehouse.updateStock(command.getWarehouseId(), command.getStock());

        emit().onResponse(new ResponseEvents(warehouse.getUncommittedChanges()));
    }
}
