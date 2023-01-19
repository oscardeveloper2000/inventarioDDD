package org.example.rack;

import co.com.sofka.domain.generic.AggregateEvent;
import org.example.rack.entities.Level;
import org.example.rack.entities.Section;
import org.example.rack.events.RackCreated;
import org.example.rack.values.LoadCapicity;
import org.example.rack.values.RackId;

public class Rack extends AggregateEvent<RackId> {
    protected LoadCapicity loadCapicity;
    protected Section section;
    protected Level level;

    public Rack(RackId rackId, LoadCapicity loadCapicity) {
        super(rackId);
        appendChange(new RackCreated(loadCapicity)).apply();
    }

    public LoadCapicity getCapacidadCarga(){
        return loadCapicity;
    }
}
