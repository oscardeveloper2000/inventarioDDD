package org.example.rack.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.rack.values.LoadCapicity;
import org.example.rack.values.RackId;

public class LoadCapacityUpdated extends DomainEvent {

    private final RackId rackId;

    private final LoadCapicity loadCapicity;

    public LoadCapacityUpdated(RackId rackId,LoadCapicity loadCapicity){
        super("org.example.rack.events.LoadCapacityUpdated");
        this.rackId = rackId;
        this.loadCapicity = loadCapicity;
    }

    public RackId getRackId(){
        return rackId;
    }

    public LoadCapicity getLoadCapicity(){
        return loadCapicity;
    }
}
