package org.example.warehouse;

import co.com.sofka.domain.generic.EventChange;
import org.example.warehouse.entities.Grocer;
import org.example.warehouse.entities.Supervisor;
import org.example.warehouse.events.GrocerAdded;
import org.example.warehouse.events.SupervisorAdded;
import org.example.warehouse.events.WarehouseCreated;

public class WarehouseEventChange extends EventChange {
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
    }
}
