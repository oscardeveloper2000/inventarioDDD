package org.example.rack.values;

import co.com.sofka.domain.generic.ValueObject;

public class LoadCapicity implements ValueObject<Integer>{

    private final int load;

    public LoadCapicity(int load) {
        this.load = load;
    }

    public static LoadCapicity of(int load) {
        return new LoadCapicity(load);
    }

    @Override
    public Integer value(){
        return this.load;
    }
}
