package org.example.product.values;

import co.com.sofka.domain.generic.ValueObject;

public class Capicity implements ValueObject<Integer>{

    private final int weight;

    public Capicity(int weight) {
        this.weight = weight;
    }

    @Override
    public Integer value(){
        return this.weight;
    }
}
