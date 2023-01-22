package org.example.rack.entities;

import co.com.sofka.domain.generic.Entity;
import org.example.rack.values.LevelId;
import org.example.rack.values.Reference;
import org.example.rack.values.State;

/**
 * Esta clase representa la entidad Level
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class Level extends Entity<LevelId> {
    /**
     * Representa el estado del Nivel
     */
    private State state;
    /**
     * Representa la referencia del nivel
     */
    private Reference reference;

    /**
     * Representa el constructor de la entidad Level
     * @param levelId
     * @param state
     * @param reference
     */
    public Level(LevelId levelId, State state, Reference reference){
        super(levelId);
        this.state = state;
        this.reference = reference;
    }

    /**
     * Representa el metodo que retorna el estado del Level
     * @return el estado del Level de tipo State
     */
    public State State(){
        return state;
    }

    /**
     * Representa el metodo que retorna la referencia del Level
     * @return la referencia del Level de tipo Reference
     */
    public Reference Reference(){
        return reference;
    }
}
