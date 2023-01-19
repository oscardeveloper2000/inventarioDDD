package org.example.product;

import co.com.sofka.domain.generic.AggregateEvent;
import org.example.product.entities.Lot;
import org.example.product.entities.Packaging;
import org.example.product.events.ProductCreated;
import org.example.product.values.ProductId;
import org.example.product.values.Quantity;

public class Product extends AggregateEvent<ProductId> {
    protected Quantity quantity;
    protected Lot lot;
    protected Packaging packaging;

    public Product(ProductId productId, Quantity quantity){
        super(productId);
        appendChange(new ProductCreated(quantity)).apply();
    }

    public Quantity getQuantity() {
        return quantity;
    }
}
