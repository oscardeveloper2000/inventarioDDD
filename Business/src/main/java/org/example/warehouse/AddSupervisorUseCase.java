package org.example.warehouse;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.product.Product;
import org.example.product.commands.AddPackaging;
import org.example.warehouse.commands.AddSupervisor;

public class AddSupervisorUseCase extends UseCase<RequestCommand<AddSupervisor>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddSupervisor> addSupervisorRequestCommand) {
        var command = addSupervisorRequestCommand.getCommand();
        var warehouse = Warehouse.from(command.getWarehouseId(), repository().getEventsBy(command.getWarehouseId().value()));
        warehouse.addSupervisor(command.getPersonalData());

        emit().onResponse(new ResponseEvents(warehouse.getUncommittedChanges()));

    }
}
