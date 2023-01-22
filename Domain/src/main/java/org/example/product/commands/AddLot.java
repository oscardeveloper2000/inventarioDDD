package org.example.product.commands;

import co.com.sofka.domain.generic.Command;
import org.example.product.values.Date;
import org.example.product.values.ProductId;
/**
 * Esta clase representa el comando AddLot
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class AddLot extends Command {
    /**
     * Representa el identificador del Product
     */
    private final ProductId productId;
    /**
     * Representa la fecha del lote
     */
    private final Date date;

    /**
     * Representa el constructor del comando AddLot
     * @param productId
     * @param date
     */
    public AddLot(ProductId productId, Date date) {
        this.productId = productId;
        this.date = date;
    }

    /**
     * Representa el metodo que retorna el identificador del Product
     * @return Identificador del Product tipo ProductId
     */
    public ProductId getProductId(){
        return productId;
    }

    /**
     * Representa el metodo que retorna la fecha del Lot
     * @return las fechas pertinentes del lote
     */
    public Date getDate(){
        return date;
    }
}
