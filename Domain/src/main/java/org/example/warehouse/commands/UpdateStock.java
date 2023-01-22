package org.example.warehouse.commands;

import co.com.sofka.domain.generic.Command;
import org.example.warehouse.values.Stock;
import org.example.warehouse.values.WarehouseId;

/**
 * Esta clase representa el comando UpdateStock
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class UpdateStock extends Command {
    /**
     * Representa el stock del Warehouse
     */
    private final WarehouseId warehouseId;
    /**
     * Representa el stock del Warehouse
     */
    private final Stock stock;

    /**
     * Representa el constructor del comando CreateWarehouse
     * @param warehouseId
     * @param stock
     */
    public UpdateStock(WarehouseId warehouseId, Stock stock){
        this.warehouseId = warehouseId;
        this.stock = stock;
    }

    /**
     * Representa el metodo que retorna el identificador del Warehouse
     * @return Identificador del Warehouse tipo WarehouseId
     */
    public WarehouseId getWarehouseId() {
        return warehouseId;
    }

    /**
     * Representa el metodo que retorna el Stock del Warehouse
     * @return Stock del Warehouse tipo Stock
     */
    public Stock getStock() {
        return stock;
    }

}
