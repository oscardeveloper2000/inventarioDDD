package org.example.product;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.product.commands.UpdateQuantity;
/**
 * Esta clase representa el caso de uso de Actualizar Cantidad
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class UpdateQuantityUseCase extends UseCase<RequestCommand<UpdateQuantity>,ResponseEvents> {
    /**
     * Representa el metodo que ejecuta un caso de uso
     * @param updateQuantityRequestCommand
     */
    @Override
    public void executeUseCase(RequestCommand<UpdateQuantity> updateQuantityRequestCommand) {
        var command = updateQuantityRequestCommand.getCommand();

        var product = Product.from(command.getProductId(), repository().getEventsBy(command.getProductId().value()));

        product.updateQuantity(command.getProductId(), command.getQuantity());

        emit().onResponse(new ResponseEvents(product.getUncommittedChanges()));
    }

}
