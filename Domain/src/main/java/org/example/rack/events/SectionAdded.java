package org.example.rack.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.rack.values.Reference;
import org.example.rack.values.SectionId;
import org.example.rack.values.State;
/**
 * Esta clase representa el evento SectionAdded
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class SectionAdded extends DomainEvent {
    /**
     * Representa el identificador del nivel
     */
    private final SectionId sectionId;
    /**
     * Representa el estado de la sección
     */
    private final State state;
    /**
     * Representa la referencia de la sección
     */
    private final Reference reference;

    /**
     * Representa el constructor del evento SectionAdded
     * @param sectionId
     * @param reference
     * @param state
     */
    public SectionAdded(SectionId sectionId, Reference reference, State state) {
        super("org.example.rack.events.SectionAdded");
        this.sectionId = sectionId;
        this.reference = reference;
        this.state = state;
    }

    /**
     * Representa el metodo que retorno el identificador de la Section
     * @return
     */
    public SectionId getSectionId() {
        return sectionId;
    }

    /**
     * Representa el metodo que retorna la referencia de la sección
     * @return
     */
    public Reference getReference() {
        return reference;
    }

    /**
     * Representa el metodo que retorna el estado de la sección
     * @return
     */
    public State getState() {
        return state;
    }

}
