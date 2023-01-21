package org.example.warehouse;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.warehouse.commands.UpdateStock;

public class UpdateStockUseCase extends UseCase<RequestCommand<UpdateStock>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateStock> updateStockRequestCommand) {
        var command = updateStockRequestCommand.getCommand();

        var warehouse = Warehouse.from(command.getWarehouseId(), repository().getEventsBy(command.getWarehouseId().value()));

        warehouse.updateStock(command.getWarehouseId(), command.getStock());

        emit().onResponse(new ResponseEvents(warehouse.getUncommittedChanges()));
    }
}
