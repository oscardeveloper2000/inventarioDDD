package org.example.warehouse.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.warehouse.values.Stock;
import org.example.warehouse.values.WarehouseId;

public class StockUpdated extends DomainEvent {
    private final WarehouseId warehouseId;
    private final Stock stock;

    public StockUpdated(WarehouseId warehouseId, Stock stock){
        super("org.example.warehouse.events.StockUpdated");
        this.warehouseId = warehouseId;
        this.stock = stock;
    }

    public WarehouseId getWarehouseId() {
        return warehouseId;
    }

    public Stock getStock() {
        return stock;
    }

}
