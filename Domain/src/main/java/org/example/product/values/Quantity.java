package org.example.product.values;

import co.com.sofka.domain.generic.ValueObject;

public class Quantity implements ValueObject<Integer> {

    private final int quantity;

    public Quantity(int quantity){
        this.quantity = quantity;
    }

    public static Quantity of(int quantity){
        return new Quantity(quantity);
    }

    @Override
    public Integer value(){
        return this.quantity;
    }
}
