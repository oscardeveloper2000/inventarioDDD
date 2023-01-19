package org.example.rack.values;

import co.com.sofka.domain.generic.ValueObject;

public class Reference implements ValueObject<String> {

    private final String reference;

    public Reference(String reference) {
        this.reference = reference;
    }

    @Override
    public String value(){
        return this.reference;
    }
}
