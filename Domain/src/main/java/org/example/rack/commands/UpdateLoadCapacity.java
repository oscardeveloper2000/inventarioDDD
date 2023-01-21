package org.example.rack.commands;

import co.com.sofka.domain.generic.Command;
import org.example.rack.values.LoadCapicity;
import org.example.rack.values.RackId;

public class UpdateLoadCapacity extends Command {

    private final RackId rackId;

    private final LoadCapicity loadCapicity;

    public UpdateLoadCapacity(RackId rackId, LoadCapicity loadCapicity){
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
