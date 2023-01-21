package org.example.product.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.product.values.ProductId;
import org.example.product.values.Quantity;


public class QuantityUpdated extends DomainEvent {
    private final ProductId productId;
    private final Quantity quantity;

    public QuantityUpdated(ProductId productId, Quantity quantity){
        super("org.example.product.events.QuantityUpdated");
        this.productId = productId;
        this.quantity = quantity;
    }

    public ProductId getProductId() {
        return productId;
    }

    public Quantity getQuantity() {
        return quantity;
    }
}
