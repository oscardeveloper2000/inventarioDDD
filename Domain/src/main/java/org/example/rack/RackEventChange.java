package org.example.rack;

import co.com.sofka.domain.generic.EventChange;
import org.example.rack.entities.Level;
import org.example.rack.entities.Section;
import org.example.rack.events.LevelAdded;
import org.example.rack.events.LoadCapacityUpdated;
import org.example.rack.events.RackCreated;
import org.example.rack.events.SectionAdded;
/**
 * Esta clase representa los cambios de evento del agregado root Rack
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class RackEventChange extends EventChange {
    /**
     * Representa todos los eventos que recaen sobre el agregado root
     * @param rack
     */
    public RackEventChange(Rack rack){
        apply((RackCreated event) -> {
            rack.loadCapicity = event.getLoadCapicity();
        });

        apply((LevelAdded event) -> {
            var levelId = event.getLevelId();
            var level = new Level(levelId, event.getState(), event.getReference());
        });

        apply((SectionAdded event) -> {
            var sectionId = event.getSectionId();
            var section = new Section(sectionId, event.getState(), event.getReference());
        });

        apply((LoadCapacityUpdated event) -> {
                rack.loadCapicity = event.getLoadCapicity();
        });
    }
}
