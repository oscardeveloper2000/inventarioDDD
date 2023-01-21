package org.example.product;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.product.commands.UpdateQuantity;

public class UpdateQuantityUseCase extends UseCase<RequestCommand<UpdateQuantity>,ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateQuantity> updateQuantityRequestCommand) {
        var command = updateQuantityRequestCommand.getCommand();

        var product = Product.from(command.getProductId(), repository().getEventsBy(command.getProductId().value()));

        product.updateQuantity(command.getProductId(), command.getQuantity());

        emit().onResponse(new ResponseEvents(product.getUncommittedChanges()));
    }

}
