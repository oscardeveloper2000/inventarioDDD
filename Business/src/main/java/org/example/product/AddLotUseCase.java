package org.example.product;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.product.commands.AddLot;

public class AddLotUseCase extends UseCase<RequestCommand<AddLot>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddLot> addLotRequestCommand) {
        var command = addLotRequestCommand.getCommand();
        var product = Product.from(command.getProductId(), repository().getEventsBy(command.getProductId().value()));
        product.addLot(command.getDate());

        emit().onResponse(new ResponseEvents(product.getUncommittedChanges()));

    }
}
