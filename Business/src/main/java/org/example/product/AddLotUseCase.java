package org.example.product;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.example.product.commands.AddLot;
/**
 * Esta clase representa el caso de uso de Agegar Lote
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class AddLotUseCase extends UseCase<RequestCommand<AddLot>, ResponseEvents> {
    /**
     * Representa el metodo que ejecuta un caso de uso
     * @param addLotRequestCommand
     */
    @Override
    public void executeUseCase(RequestCommand<AddLot> addLotRequestCommand) {
        var command = addLotRequestCommand.getCommand();
        var product = Product.from(command.getProductId(), repository().getEventsBy(command.getProductId().value()));
        product.addLot(command.getDate());

        emit().onResponse(new ResponseEvents(product.getUncommittedChanges()));

    }
}
