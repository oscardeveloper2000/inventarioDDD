package org.example.rack.values;

import co.com.sofka.domain.generic.ValueObject;

public class State implements ValueObject<String>{

    private final String status;

    public State(String status) {
        this.status = status;
    }

    @Override
    public String value(){
        return this.status;
    }
}
