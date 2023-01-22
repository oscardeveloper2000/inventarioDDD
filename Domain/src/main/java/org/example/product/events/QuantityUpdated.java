package org.example.product.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.product.values.ProductId;
import org.example.product.values.Quantity;
/**
 * Esta clase representa el evento QuantityUpdated
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class QuantityUpdated extends DomainEvent {
    /**
     * Representa el identificador del producto
     */
    private final ProductId productId;
    /**
     * Representa la cantidad del producto
     */
    private final Quantity quantity;

    /**
     * Representa el constructor del evento QuantityUpdated
     * @param productId
     * @param quantity
     */
    public QuantityUpdated(ProductId productId, Quantity quantity){
        super("org.example.product.events.QuantityUpdated");
        this.productId = productId;
        this.quantity = quantity;
    }

    /**
     * Representa el metodo que retorna el identificador del Product
     * @return Identificador del Product tipo ProductId
     */
    public ProductId getProductId() {
        return productId;
    }

    /**
     * Representa el metodo que retorna la cantidad de Product
     * @return la cantidad de Product tipo Quantity
     */
    public Quantity getQuantity() {
        return quantity;
    }
}
