package org.example.rack.values;

import co.com.sofka.domain.generic.ValueObject;

public class State implements ValueObject<Boolean>{

    private final boolean status;

    public State(boolean status) {
        this.status = status;
    }

    @Override
    public Boolean value(){
        return this.status;
    }
}
