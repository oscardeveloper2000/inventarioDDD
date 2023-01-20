package org.example.product.values;

import co.com.sofka.domain.generic.ValueObject;

public class Capacity implements ValueObject<Integer>{

    private final int weight;

    public Capacity(int weight) {
        this.weight = weight;
    }

    @Override
    public Integer value(){
        return this.weight;
    }
}
