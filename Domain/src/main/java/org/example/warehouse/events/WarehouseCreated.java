package org.example.warehouse.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.warehouse.values.Stock;

public class WarehouseCreated extends DomainEvent {

    private final Stock stock;

    public WarehouseCreated(Stock stock){
        super("org.example.warehouse.events.WarehouseCreated");
        this.stock = stock;
    }

    public Stock getStock() {
        return stock;
    }

}
