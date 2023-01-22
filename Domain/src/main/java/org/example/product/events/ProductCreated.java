package org.example.product.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.product.values.Quantity;
/**
 * Esta clase representa el evento ProductCreated
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class ProductCreated extends DomainEvent {
    /**
     * Representa la cantidad de producto
     */
    private final Quantity quantity;

    /**
     * Representa el constructor del evento ProductCreated
     * @param quantity
     */
    public ProductCreated(Quantity quantity){
        super("org.example.product.events.ProductCreated");
        this.quantity = quantity;
    }

    /**
     * Representa el metodo que retorna la cantidad de Product
     * @return la cantidad de Product tipo Quantity
     */
    public Quantity getQuantity() {
        return quantity;
    }
}
