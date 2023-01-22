package org.example.rack.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.rack.values.LoadCapicity;
import org.example.rack.values.RackId;
/**
 * Esta clase representa el evento LoadCapacityUpdated
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class LoadCapacityUpdated extends DomainEvent {
    /**
     * Representa el identificador del rack
     */
    private final RackId rackId;
    /**
     * Representa la capacidad de carga del rack
     */
    private final LoadCapicity loadCapicity;

    /**
     * Representa el constructor del evento LoadCapacityUpdated
     * @param rackId
     * @param loadCapicity
     */
    public LoadCapacityUpdated(RackId rackId,LoadCapicity loadCapicity){
        super("org.example.rack.events.LoadCapacityUpdated");
        this.rackId = rackId;
        this.loadCapicity = loadCapicity;
    }

    /**
     * Representa el metodo que retorna el identificador del Rackc
     * @return Identificador del Rack tipo RackId
     */
    public RackId getRackId(){
        return rackId;
    }

    /**
     * Representa el metodo que retorna la capacidad de carga de Rack
     * @return la cantidad de carga que soporta Rack tipo LoadCapacity
     */
    public LoadCapicity getLoadCapicity(){
        return loadCapicity;
    }
}
