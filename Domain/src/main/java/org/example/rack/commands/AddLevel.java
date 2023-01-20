package org.example.rack.commands;

import co.com.sofka.domain.generic.Command;
import org.example.rack.Rack;
import org.example.rack.values.LevelId;
import org.example.rack.values.RackId;
import org.example.rack.values.Reference;
import org.example.rack.values.State;

public class AddLevel extends Command {
    private final RackId rackId;
    private final State state;
    private final Reference reference;

    public AddLevel(RackId rackId, State state, Reference reference) {
        this.rackId = rackId;
        this.state = state;
        this.reference = reference;
    }

    public RackId getRackId(){
        return rackId;
    }

    public State getState(){
        return state;
    }

    public Reference getReference(){
        return reference;
    }
}
