package org.example.rack.entities;

import co.com.sofka.domain.generic.Entity;
import org.example.rack.values.LevelId;
import org.example.rack.values.Reference;
import org.example.rack.values.State;

public class Level extends Entity<LevelId> {

    private State state;
    private Reference reference;

    public Level(LevelId levelId, State state, Reference reference){
        super(levelId);
        this.state = state;
        this.reference = reference;
    }

    public State State(){
        return state;
    }

    public Reference Reference(){
        return reference;
    }
}
