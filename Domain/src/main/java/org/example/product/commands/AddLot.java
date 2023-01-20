package org.example.product.commands;

import co.com.sofka.domain.generic.Command;
import org.example.product.values.Date;
import org.example.product.values.ProductId;

public class AddLot extends Command {
    private final ProductId productId;
    private final Date date;

    public AddLot(ProductId productId, Date date) {
        this.productId = productId;
        this.date = date;
    }

    public ProductId getProductId(){
        return productId;
    }

    public Date getDate(){
        return date;
    }
}
