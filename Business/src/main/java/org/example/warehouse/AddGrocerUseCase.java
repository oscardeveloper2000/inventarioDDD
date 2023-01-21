package org.example.warehouse;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.warehouse.commands.AddGrocer;

public class AddGrocerUseCase extends UseCase<RequestCommand<AddGrocer>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddGrocer> addGrocerRequestCommand) {
        var command = addGrocerRequestCommand.getCommand();
        var warehouse = Warehouse.from(command.getWarehouseId(), repository().getEventsBy(command.getWarehouseId().value()));
        warehouse.addGrocer(command.getPersonalData());

        emit().onResponse(new ResponseEvents(warehouse.getUncommittedChanges()));

    }
}
