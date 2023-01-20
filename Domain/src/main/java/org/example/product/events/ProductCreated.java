package org.example.product.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.product.values.ProductId;
import org.example.product.values.Quantity;
import org.example.rack.values.LoadCapicity;

public class ProductCreated extends DomainEvent {

    private final Quantity quantity;

    public ProductCreated(Quantity quantity){
        super("org.example.product.events.ProductCreated");
        this.quantity = quantity;
    }

    public Quantity getQuantity() {
        return quantity;
    }
}
