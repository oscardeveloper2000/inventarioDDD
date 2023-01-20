package org.example.product;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.product.commands.CreateProduct;


public class CreateProductUseCase extends UseCase<RequestCommand<CreateProduct>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CreateProduct> createProductRequestCommand) {
        var command = createProductRequestCommand.getCommand();

        var product = new Product(command.getProductId(), command.getQuantity());

        emit().onResponse(new ResponseEvents(product.getUncommittedChanges()));
    }

}
