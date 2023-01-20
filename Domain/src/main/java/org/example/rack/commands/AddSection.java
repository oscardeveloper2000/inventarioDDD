package org.example.rack.commands;

import co.com.sofka.domain.generic.Command;
import org.example.rack.Rack;
import org.example.rack.values.RackId;
import org.example.rack.values.Reference;
import org.example.rack.values.SectionId;
import org.example.rack.values.State;

public class AddSection extends Command {
    private final RackId rackId;
    private final Reference reference;
    private final State state;

    public AddSection(RackId rackId, Reference reference, State state) {
        this.rackId = rackId;
        this.reference = reference;
        this.state = state;
    }

    public RackId getRackId() {
        return rackId;
    }

    public Reference getReference() {
        return reference;
    }

    public State getState() {
        return state;
    }
}
