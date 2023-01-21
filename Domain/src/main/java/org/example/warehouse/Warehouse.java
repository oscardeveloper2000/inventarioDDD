package org.example.warehouse;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.warehouse.entities.Grocer;
import org.example.warehouse.entities.Supervisor;
import org.example.warehouse.events.GrocerAdded;
import org.example.warehouse.events.StockUpdated;
import org.example.warehouse.events.SupervisorAdded;
import org.example.warehouse.events.WarehouseCreated;
import org.example.warehouse.values.*;

import java.util.List;

public class Warehouse extends AggregateEvent<WarehouseId> {

    protected Stock stock;
    protected Supervisor supervisor;
    protected Grocer grocer;

    public Warehouse(WarehouseId warehouseId, Stock stock) {
        super(warehouseId);
        appendChange(new WarehouseCreated(stock)).apply();
    }

    private Warehouse(WarehouseId warehouseId){
        super(warehouseId);
        subscribe(new WarehouseEventChange(this));
    }

    public static Warehouse from(WarehouseId warehouseId, List<DomainEvent> events){
        var warehouse = new Warehouse(warehouseId);
        events.forEach(warehouse::applyEvent);
        return warehouse;
    }

    public void addGrocer(PersonalData personalData){
        var grocerId = new GrocerId();
        appendChange(new GrocerAdded(grocerId, personalData)).apply();
    }

    public void addSupervisor(PersonalData personalData){
        var supervisorId = new SupervisorId();
        appendChange(new SupervisorAdded(supervisorId, personalData)).apply();
    }

    public void updateStock(WarehouseId warehouseId, Stock stock){
        appendChange(new StockUpdated(warehouseId, stock)).apply();
    }

    public Grocer getGrocer(){
        return grocer;
    }

    public Supervisor getSupervisor(){
        return supervisor;
    }

    public Stock getStock(){
        return stock;
    }


}
