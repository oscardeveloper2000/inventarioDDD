package org.example.rack.entities;

import co.com.sofka.domain.generic.Entity;
import org.example.rack.values.Reference;
import org.example.rack.values.SectionId;
import org.example.rack.values.State;

public class Section extends Entity<SectionId> {

    private State state;
    private Reference reference;

    public Section(SectionId sectionId, State state, Reference reference){
        super(sectionId);
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
