package org.example.rack;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.rack.entities.Level;
import org.example.rack.entities.Section;
import org.example.rack.events.LevelAdded;
import org.example.rack.events.RackCreated;
import org.example.rack.events.SectionAdded;
import org.example.rack.values.*;

import javax.management.openmbean.OpenDataException;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Rack extends AggregateEvent<RackId> {
    protected LoadCapicity loadCapicity;
    protected Section section;
    protected Level level;

    public Rack(RackId rackId, LoadCapicity loadCapicity) {
        super(rackId);
        appendChange(new RackCreated(loadCapicity)).apply();
    }
    private Rack(RackId rackId){
        super(rackId);
        subscribe(new RackEventChange(this));
    }
    public static Rack from(RackId rackId, List<DomainEvent> events){
        var rack = new Rack(rackId);
        events.forEach(rack::applyEvent);
        return rack;
    }

    public void addLevel(State state, Reference reference){
        var levelId = new LevelId();
        appendChange(new LevelAdded(levelId, state, reference)).apply();
    }

    public void addSection(State state, Reference reference) {
        var sectionId = new SectionId();
        appendChange(new SectionAdded(sectionId, reference, state)).apply();
    }

    public LoadCapicity getCapacidadCarga(){
        return loadCapicity;
    }

    public Section getSection(){
        return section;
    }

    public Level getLevel(){
        return level;
    }
}
