package org.example.product;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.product.commands.AddPackaging;

public class AddPackagingUseCase extends UseCase<RequestCommand<AddPackaging>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddPackaging> addPackagingRequestCommand) {
        var command = addPackagingRequestCommand.getCommand();
        var product = Product.from(command.getProductId(), repository().getEventsBy(command.getProductId().value()));
        product.addPackaging(command.getCapacity(), command.getDimension());

        emit().onResponse(new ResponseEvents(product.getUncommittedChanges()));

    }
}
