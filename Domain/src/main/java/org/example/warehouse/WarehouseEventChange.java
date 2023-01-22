package org.example.warehouse;

import co.com.sofka.domain.generic.EventChange;
import org.example.rack.events.LoadCapacityUpdated;
import org.example.warehouse.entities.Grocer;
import org.example.warehouse.entities.Supervisor;
import org.example.warehouse.events.GrocerAdded;
import org.example.warehouse.events.StockUpdated;
import org.example.warehouse.events.SupervisorAdded;
import org.example.warehouse.events.WarehouseCreated;
/**
 * Esta clase representa los cambios de evento del agregado root Warehouse
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class WarehouseEventChange extends EventChange {
    /**
     * Representa todos los eventos que recaen sobre el agregado root
     * @param warehouse
     */
    public WarehouseEventChange(Warehouse warehouse){
        apply((WarehouseCreated event) -> {
            warehouse.stock = event.getStock();
        });

        apply((GrocerAdded event) -> {
            var grocerId = event.getGrocerId();
            var grocer = new Grocer(grocerId, event.getPersonalData());
        });

        apply((SupervisorAdded event) -> {
            var supervisorId = event.getSupervisorId();
            var supervisor = new Supervisor(supervisorId, event.getPersonalData());
        });

        apply((StockUpdated event) -> {
            warehouse.stock = event.getStock();
        });
    }
}
