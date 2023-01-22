package org.example.rack.commands;

import co.com.sofka.domain.generic.Command;
import org.example.rack.Rack;
import org.example.rack.values.RackId;
import org.example.rack.values.Reference;
import org.example.rack.values.SectionId;
import org.example.rack.values.State;

/**
 * Esta clase representa el comando AddSection
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class AddSection extends Command {
    /**
     * Representa el identificador del Rack
     */
    private final RackId rackId;
    /**
     * Represennta la referencia de Section
     */
    private final Reference reference;
    /**
     * Representa el estado de Section
     */
    private final State state;

    /**
     * Representa el constructor del comando AddSection
     * @param rackId
     * @param reference
     * @param state
     */
    public AddSection(RackId rackId, Reference reference, State state) {
        this.rackId = rackId;
        this.reference = reference;
        this.state = state;
    }

    /**
     * Representa el metodo que retorna el identificador del Rack
     * @return Identificador del Rack tipo RackId
     */
    public RackId getRackId() {
        return rackId;
    }

    public Reference getReference() {
        return reference;
    }

    /**
     * Representa el metodo que retorna la referencia del Section
     * @return la referencia del Section
     */
    public State getState() {
        return state;
    }
}
