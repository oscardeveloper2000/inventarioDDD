package org.example.warehouse;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.warehouse.commands.CreateWarehouse;

public class CreateWarehouseUseCase extends UseCase<RequestCommand<CreateWarehouse>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CreateWarehouse> createWarehouseRequestCommand) {
        var command = createWarehouseRequestCommand.getCommand();

        var warehouse = new Warehouse(command.getWarehouseId(), command.getStock());

        emit().onResponse(new ResponseEvents(warehouse.getUncommittedChanges()));
    }

}
