package org.example.product;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.product.commands.CreateProduct;

/**
 * Esta clase representa el caso de uso de Crear Producto
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class CreateProductUseCase extends UseCase<RequestCommand<CreateProduct>, ResponseEvents> {
    /**
     * Representa el metodo que ejecuta un caso de uso
     * @param createProductRequestCommand
     */
    @Override
    public void executeUseCase(RequestCommand<CreateProduct> createProductRequestCommand) {
        var command = createProductRequestCommand.getCommand();

        var product = new Product(command.getProductId(), command.getQuantity());

        emit().onResponse(new ResponseEvents(product.getUncommittedChanges()));
    }

}
