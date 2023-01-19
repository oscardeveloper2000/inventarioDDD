package org.example.rack.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class LoadCapicity implements ValueObject<Integer>{

    private final int load;

    public LoadCapicity(int load) {
        this.load = load;
    }

    @Override
    public Integer value(){
        return this.load;
    }
}
