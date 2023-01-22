package org.example.rack.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.rack.values.LoadCapicity;
/**
 * Esta clase representa el evento RackCreated
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class RackCreated extends DomainEvent {

    /**
     * Representa la capacidad de carga del rack
     */
    private final LoadCapicity loadCapicity;

    /**
     * Representa el constructor del evento RackCreated
     * @param loadCapicity
     */
    public RackCreated(LoadCapicity loadCapicity){
        super("org.example.rack.events.RackCreated");
        this.loadCapicity = loadCapicity;
    }

    /**
     * Representa el metodo que retorna la capacidad de carga de Rack
     * @return la cantidad de carga que soporta Rack tipo LoadCapacity
     */
    public LoadCapicity getLoadCapicity() {
        return loadCapicity;
    }
}
