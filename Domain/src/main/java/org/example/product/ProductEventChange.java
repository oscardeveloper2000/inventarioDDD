package org.example.product;

import co.com.sofka.domain.generic.EventChange;
import org.example.product.entities.Lot;
import org.example.product.entities.Packaging;
import org.example.product.events.LotAdded;
import org.example.product.events.PackagingAdded;
import org.example.product.events.ProductCreated;
import org.example.product.events.QuantityUpdated;

/**
 * Esta clase representa los cambios de evento del agregado root Product
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */

public class ProductEventChange extends EventChange {
    /**
     * Representa todos los eventos que recaen sobre el agregado root
     * @param product
     */
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

        apply((QuantityUpdated event) -> {
            product.quantity = event.getQuantity();
        });
    }
}
