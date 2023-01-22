package org.example.rack.commands;

import co.com.sofka.domain.generic.Command;
import org.example.rack.values.LoadCapicity;
import org.example.rack.values.RackId;

/**
 * Esta clase representa el comando UpdateLoadCapacity
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class UpdateLoadCapacity extends Command {
    /**
     * Representa el identificador del Rack
     */
    private final RackId rackId;
    /**
     * Representa la capacidad de carga del Rack
     */
    private final LoadCapicity loadCapicity;

    /**
     * Representa el constructor del comando UpdateLoadCapacity
     * @param rackId
     * @param loadCapicity
     */
    public UpdateLoadCapacity(RackId rackId, LoadCapicity loadCapicity){
        this.rackId = rackId;
        this.loadCapicity = loadCapicity;
    }

    /**
     * Representa el metodo que retorna el identificador del Rack
     * @return Identificador del Rack tipo RackId
     */
    public RackId getRackId(){
        return rackId;
    }

    /**
     * Representa el metodo que retorna la capacidad de carga del Rack
     * @return la capacidad de carga del Rack de tipo LoadCapacity
     */
    public LoadCapicity getLoadCapicity(){
        return loadCapicity;
    }
}
