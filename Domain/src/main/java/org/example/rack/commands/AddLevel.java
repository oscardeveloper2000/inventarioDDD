package org.example.rack.commands;

import co.com.sofka.domain.generic.Command;
import org.example.rack.Rack;
import org.example.rack.values.LevelId;
import org.example.rack.values.RackId;
import org.example.rack.values.Reference;
import org.example.rack.values.State;

/**
 * Esta clase representa el comando AddLevel
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class AddLevel extends Command {
    /**
     * Representa el identificador del Rack
     */
    private final RackId rackId;
    /**
     * Representa el estado de Level
     */
    private final State state;
    /**
     * Represennta la referencia de Level
     */
    private final Reference reference;

    /**
     * Representa el constructor del comando AddLevel
     * @param rackId
     * @param state
     * @param reference
     */
    public AddLevel(RackId rackId, State state, Reference reference) {
        this.rackId = rackId;
        this.state = state;
        this.reference = reference;
    }

    /**
     * Representa el metodo que retorna el identificador del Rack
     * @return Identificador del Rack tipo RackId
     */
    public RackId getRackId(){
        return rackId;
    }

    /**
     * Representa el metodo que retorna el estado del Level
     * @return el estado del Level tipo State
     */
    public State getState(){
        return state;
    }

    /**
     * Representa el metodo que retorna la referencia del Level
     * @return la referencia del Level
     */
    public Reference getReference(){
        return reference;
    }
}
