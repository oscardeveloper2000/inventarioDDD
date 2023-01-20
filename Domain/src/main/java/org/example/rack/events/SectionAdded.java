package org.example.rack.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.rack.values.Reference;
import org.example.rack.values.SectionId;
import org.example.rack.values.State;

public class SectionAdded extends DomainEvent {
    private final SectionId sectionId;
    private final State state;
    private final Reference reference;

    public SectionAdded(SectionId sectionId, Reference reference, State state) {
        super("org.example.rack.events.SectionAdded");
        this.sectionId = sectionId;
        this.reference = reference;
        this.state = state;
    }

    public SectionId getSectionId() {
        return sectionId;
    }

    public Reference getReference() {
        return reference;
    }

    public State getState() {
        return state;
    }

}
