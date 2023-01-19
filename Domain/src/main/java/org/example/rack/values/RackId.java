package org.example.rack.values;

import co.com.sofka.domain.generic.Identity;

public class RackId extends Identity {

    public RackId(){}

    private RackId(String id){
        super(id);
    }

    public static RackId of(String id){
        return new RackId(id);
    }
}
