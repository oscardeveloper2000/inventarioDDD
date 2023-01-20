package org.example.product.commands;

import co.com.sofka.domain.generic.Command;
import org.example.product.values.Capacity;
import org.example.product.values.Dimension;
import org.example.product.values.ProductId;

public class AddPackaging extends Command {
    private final ProductId productId;
    private final Capacity capacity;
    private final Dimension dimension;

    public AddPackaging(ProductId productId, Capacity capacity, Dimension dimension) {
        this.productId = productId;
        this.capacity = capacity;
        this.dimension = dimension;
    }

    public ProductId getProductId() {
        return productId;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
