package org.example.product;

import co.com.sofka.domain.generic.EventChange;
import org.example.product.entities.Lot;
import org.example.product.entities.Packaging;
import org.example.product.events.LotAdded;
import org.example.product.events.PackagingAdded;
import org.example.product.events.ProductCreated;


public class ProductEventChange extends EventChange {
    public ProductEventChange(Product product){
        apply((ProductCreated event) -> {
            product.quantity = event.getQuantity();
        });

        apply((LotAdded event) -> {
            var lotId = event.getLotId();
            var lot = new Lot(lotId, event.getDate());
        });

        apply((PackagingAdded event) -> {
            var packagingId = event.getPackagingId();
            var packaging = new Packaging(packagingId, event.getDimension(),event.getCapacity() );
        });
    }
}
