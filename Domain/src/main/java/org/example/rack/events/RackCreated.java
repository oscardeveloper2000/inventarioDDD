package org.example.rack.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.rack.values.LoadCapicity;

public class RackCreated extends DomainEvent {

    private final LoadCapicity loadCapicity;

    public RackCreated(LoadCapicity loadCapicity){
        super("org.example.rack.events.RackCreated");
        this.loadCapicity = loadCapicity;
    }

    public LoadCapicity getLoadCapicity() {
        return loadCapicity;
    }
}
