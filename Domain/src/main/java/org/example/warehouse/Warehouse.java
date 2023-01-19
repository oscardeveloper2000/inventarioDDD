package org.example.warehouse;

import co.com.sofka.domain.generic.AggregateEvent;
import org.example.warehouse.entities.Grocer;
import org.example.warehouse.entities.Supervisor;
import org.example.warehouse.events.WarehouseCreated;
import org.example.warehouse.values.Stock;
import org.example.warehouse.values.WarehouseId;

public class Warehouse extends AggregateEvent<WarehouseId> {

    protected Stock stock;
    protected Supervisor supervisor;
    protected Grocer grocer;

    public Warehouse(WarehouseId warehouseId, Stock stock) {
        super(warehouseId);
        appendChange(new WarehouseCreated(stock)).apply();
    }

    public Stock getStock(){
        return stock;
    }


}
