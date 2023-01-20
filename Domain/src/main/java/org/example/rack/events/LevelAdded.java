package org.example.rack.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.rack.values.LevelId;
import org.example.rack.values.Reference;
import org.example.rack.values.State;

public class LevelAdded extends DomainEvent {
    private final LevelId levelId;
    private final State state;
    private final Reference reference;

    public LevelAdded(LevelId levelId, State state, Reference reference) {
        super("org.example.rack.events.LevelAdded");
        this.levelId = levelId;
        this.state = state;
        this.reference = reference;
    }

    public LevelId getLevelId(){
        return levelId;
    }

    public State getState(){
        return state;
    }

    public Reference getReference(){
        return reference;
    }

}
