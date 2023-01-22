package org.example.warehouse.commands;

import co.com.sofka.domain.generic.Command;
import org.example.warehouse.values.Stock;
import org.example.warehouse.values.WarehouseId;

public class UpdateStock extends Command {
    private final WarehouseId warehouseId;
    private final Stock stock;

    public UpdateStock(WarehouseId warehouseId, Stock stock){
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