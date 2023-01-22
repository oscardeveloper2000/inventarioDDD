package org.example.warehouse.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.warehouse.values.Stock;

/**
 * Esta clase representa el evento WarehouseCreated
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class WarehouseCreated extends DomainEvent {

    /**
     * Representa el stock del Warehouse
     */
    private final Stock stock;

    /**
     * Representa el constructor del comando WarehouseCreated
     * @param stock
     */
    public WarehouseCreated(Stock stock){
        super("org.example.warehouse.events.WarehouseCreated");
        this.stock = stock;
    }

    /**
     * Representa el metodo que retorna el Stock del Warehouse
     * @return Stock del Warehouse tipo Stock
     */
    public Stock getStock() {
        return stock;
    }

}
