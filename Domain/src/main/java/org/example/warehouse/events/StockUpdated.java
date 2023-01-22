package org.example.warehouse.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.warehouse.values.Stock;
import org.example.warehouse.values.WarehouseId;

/**
 * Esta clase representa el evento StockUpdate
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class StockUpdated extends DomainEvent {
    /**
     * Representa el identificador de Supervisor
     */
    private final WarehouseId warehouseId;
    /**
     * Representa el stock del Warehouse
     */
    private final Stock stock;

    /**
     * Representa el constructor del comando StockUpdated
     * @param warehouseId
     * @param stock
     */

    public StockUpdated(WarehouseId warehouseId, Stock stock){
        super("org.example.warehouse.events.StockUpdated");
        this.warehouseId = warehouseId;
        this.stock = stock;
    }

    /**
     * Representa el metodo que retorna el identificador del Supervisor
     * @return Identificador del Supervisor tipo SupervisorId
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
