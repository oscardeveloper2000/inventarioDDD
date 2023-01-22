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

/**
 * Esta clase representa el agregado root Warehouse
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class Warehouse extends AggregateEvent<WarehouseId> {

    /**
     * Representa el stock del Warehouse
     */
    protected Stock stock;

    /**
     * Representa el supervisor del Warehouse
     */
    protected Supervisor supervisor;
    /**
     * Representa al bodeguero del Warehouse
     */
    protected Grocer grocer;

    /**
     * Representa el construstor del agregado Warehouse
     * @param warehouseId
     * @param stock
     */
    public Warehouse(WarehouseId warehouseId, Stock stock) {
        super(warehouseId);
        appendChange(new WarehouseCreated(stock)).apply();
    }

    /**
     * Representa el constructor del agregado Rack que extiende clase padre
     * @param warehouseId
     */
    private Warehouse(WarehouseId warehouseId){
        super(warehouseId);
        subscribe(new WarehouseEventChange(this));
    }

    /**
     * Representa el metodo que envia el evento que se realizara sobre el agregado
     * @param warehouseId
     * @param events
     * @return
     */
    public static Warehouse from(WarehouseId warehouseId, List<DomainEvent> events){
        var warehouse = new Warehouse(warehouseId);
        events.forEach(warehouse::applyEvent);
        return warehouse;
    }

    /**
     * Representa el metodo que agrega un supervisor al agregado Warehouse
     * @param personalData
     */
    public void addGrocer(PersonalData personalData){
        var grocerId = new GrocerId();
        appendChange(new GrocerAdded(grocerId, personalData)).apply();
    }

    /**
     * Representa el metodo que agrega un bodeguero al agregado Warehouse
     * @param personalData
     */
    public void addSupervisor(PersonalData personalData){
        var supervisorId = new SupervisorId();
        appendChange(new SupervisorAdded(supervisorId, personalData)).apply();
    }

    /**
     * Representa el metodo que actualiza el stock que tiene el agregado Warehouse
     * @param warehouseId
     * @param stock
     */
    public void updateStock(WarehouseId warehouseId, Stock stock){
        appendChange(new StockUpdated(warehouseId, stock)).apply();
    }

    /**
     * Representa el metodo que retorna el bodeguero
     * @return
     */
    public Grocer getGrocer(){
        return grocer;
    }

    /**
     * Representa el metodo que retorna el supervisor
     * @return
     */
    public Supervisor getSupervisor(){
        return supervisor;
    }

    /**
     * Representa el metodo que retorna el stock
     * @return
     */
    public Stock getStock(){
        return stock;
    }


}
