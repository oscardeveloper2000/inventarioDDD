package org.example.rack.entities;

import co.com.sofka.domain.generic.Entity;
import org.example.rack.values.Reference;
import org.example.rack.values.SectionId;
import org.example.rack.values.State;

/**
 * Esta clase representa la entidad Section
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class Section extends Entity<SectionId> {
    /**
     * Representa el estado de la sección
     */
    private State state;
    /**
     * Representa la referencia de la sección
     */
    private Reference reference;

    /**
     * Representa el constructor de la entidad Section
     * @param sectionId
     * @param state
     * @param reference
     */
    public Section(SectionId sectionId, State state, Reference reference){
        super(sectionId);
        this.state = state;
        this.reference = reference;
    }

    /**
     * Representa el metodo que retorna el estado de la Section
     * @return el estado del Section de tipo State
     */
    public State State(){
        return state;
    }

    /**
     * Representa el metodo que retorna la referencia del Section
     * @return la referencia del Section de tipo Reference
     */
    public Reference Reference(){
        return reference;
    }

}
