package org.example.rack;

import co.com.sofka.domain.generic.EventChange;
import org.example.rack.entities.Level;
import org.example.rack.entities.Section;
import org.example.rack.events.LevelAdded;
import org.example.rack.events.RackCreated;
import org.example.rack.events.SectionAdded;

public class RackEventChange extends EventChange {
    public RackEventChange(Rack rack){
        apply((RackCreated event) -> {
            rack.loadCapicity = event.capacidadCarga();
        });

        apply((LevelAdded event) -> {
            var levelId = event.getLevelId();
            var level = new Level(levelId, event.getState(), event.getReference());
        });

        apply((SectionAdded event) -> {
            var sectionId = event.getSectionId();
            var section = new Section(sectionId, event.getState(), event.getReference());
        });
    }
}
