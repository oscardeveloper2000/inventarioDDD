package org.example.product;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.product.entities.Lot;
import org.example.product.entities.Packaging;
import org.example.product.events.LotAdded;
import org.example.product.events.PackagingAdded;
import org.example.product.events.ProductCreated;
import org.example.product.values.*;
import org.example.rack.RackEventChange;
import org.example.rack.events.LevelAdded;
import org.example.rack.events.SectionAdded;
import org.example.rack.values.LevelId;
import org.example.rack.values.Reference;
import org.example.rack.values.SectionId;
import org.example.rack.values.State;


import java.util.List;

public class Product extends AggregateEvent<ProductId> {
    protected Quantity quantity;
    protected Lot lot;
    protected Packaging packaging;

    public Product(ProductId productId, Quantity quantity){
        super(productId);
        appendChange(new ProductCreated(quantity)).apply();
    }
    private Product(ProductId productId){
        super(productId);
        subscribe(new ProductEventChange(this));
    }
    public static Product from(ProductId productId, List<DomainEvent> events){
        var product = new Product(productId);
        events.forEach(product::applyEvent);
        return product;
    }

    public void addLot(Date date){
        var lotId = new LotId();
        appendChange(new LotAdded(lotId, date)).apply();
    }

    public void addPackaging(Capacity capacity, Dimension dimension) {
        var packagingId = new PackagingId();
        appendChange(new PackagingAdded(packagingId, capacity, dimension)).apply();
    }
    public Quantity getQuantity() {
        return quantity;
    }

    public Lot getLot() {
        return lot;
    }
}
