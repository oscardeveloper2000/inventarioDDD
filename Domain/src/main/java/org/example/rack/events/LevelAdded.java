package org.example.rack.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.rack.values.LevelId;
import org.example.rack.values.Reference;
import org.example.rack.values.State;
/**
 * Esta clase representa el evento LevelAdded
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class LevelAdded extends DomainEvent {
    /**
     * Representa el identificador del nivel
     */
    private final LevelId levelId;
    /**
     * Representa el estado del nivel
     */
    private final State state;
    /**
     * Representa la referencia del nivel
     */
    private final Reference reference;

    /**
     * Representa el constructor del evento LevelAdded
     * @param levelId
     * @param state
     * @param reference
     */
    public LevelAdded(LevelId levelId, State state, Reference reference) {
        super("org.example.rack.events.LevelAdded");
        this.levelId = levelId;
        this.state = state;
        this.reference = reference;
    }

    /**
     * Representa el metodo que retorno el identificador del Level
     * @return Identificador del Nivel tipo NivelId
     */
    public LevelId getLevelId(){
        return levelId;
    }

    /**
     * Representa el metodo que retorna el estado del nivel
     * @return
     */
    public State getState(){
        return state;
    }

    /**
     * Representa el metodo que retorna la referencia del nivel
     * @return
     */
    public Reference getReference(){
        return reference;
    }

}
