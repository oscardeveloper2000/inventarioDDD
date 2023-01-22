package org.example.rack;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.rack.entities.Level;
import org.example.rack.entities.Section;
import org.example.rack.events.LevelAdded;
import org.example.rack.events.LoadCapacityUpdated;
import org.example.rack.events.RackCreated;
import org.example.rack.events.SectionAdded;
import org.example.rack.values.*;

import javax.management.openmbean.OpenDataException;
import java.util.List;
import java.util.Optional;
import java.util.Set;
/**
 * Esta clase representa el agregado root Rack
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class Rack extends AggregateEvent<RackId> {
    /**
     * Representa la capacidad de carga del rack
     */
    protected LoadCapicity loadCapicity;
    /**
     * Representa la sección del rack
     */
    protected Section section;
    /**
     * Representa el nivel del rack
     */
    protected Level level;

    /**
     * Representa el construstor del agregado Rack
     * @param rackId
     * @param loadCapicity
     */
    public Rack(RackId rackId, LoadCapicity loadCapicity) {
        super(rackId);
        appendChange(new RackCreated(loadCapicity)).apply();
    }

    /**
     * Representa el constructor del agregado Rack que extiende clase padre
     * @param rackId
     */
    private Rack(RackId rackId){
        super(rackId);
        subscribe(new RackEventChange(this));
    }

    /**
     * Representa el metodo que envia el evento que se realizara sobre el agregado
     * @param rackId
     * @param events
     * @return
     */
    public static Rack from(RackId rackId, List<DomainEvent> events){
        var rack = new Rack(rackId);
        events.forEach(rack::applyEvent);
        return rack;
    }

    /**
     * Representa el metodo que agrega un nivel al agregado Ract
     * @param state
     * @param reference
     */
    public void addLevel(State state, Reference reference){
        var levelId = new LevelId();
        appendChange(new LevelAdded(levelId, state, reference)).apply();
    }

    /**
     * Representa el metodo que agrega una sección al agregado Rack
     * @param state
     * @param reference
     */
    public void addSection(State state, Reference reference) {
        var sectionId = new SectionId();
        appendChange(new SectionAdded(sectionId, reference, state)).apply();
    }

    /**
     * Representa el metodo que actualiza la capacidad de carga de rack que tiene el agregado Rack
     * @param rackId
     * @param loadCapicity
     */
    public void updateLoadCapacity(RackId rackId, LoadCapicity loadCapicity){
        appendChange(new LoadCapacityUpdated(rackId, loadCapicity)).apply();
    }

    /**
     * Representa el metodo que retorna la capacidad de carga
     * @return
     */
    public LoadCapicity getCapacidadCarga(){
        return loadCapicity;
    }

    /**
     * Representa el metodo que retorna una sección
     * @return
     */
    public Section getSection(){
        return section;
    }

    /**
     * Representa el metodo que retorna un nivel
     * @return
     */
    public Level getLevel(){
        return level;
    }
}
