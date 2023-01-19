package org.example.product.commands;

import co.com.sofka.domain.generic.Command;
import org.example.product.values.ProductId;
import org.example.product.values.Quantity;


public class CreateProduct extends Command {
    private final ProductId productId;

    private final Quantity quantity;

    public CreateProduct(ProductId productId, Quantity quantity) {
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
