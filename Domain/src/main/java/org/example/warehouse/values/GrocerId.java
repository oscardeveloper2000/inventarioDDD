package org.example.warehouse.values;

import co.com.sofka.domain.generic.Identity;

public class GrocerId extends Identity {

    public GrocerId(){}

    public GrocerId(String id){
        super(id);
    }

    public static GrocerId of(String id){
        return new GrocerId(id);
    }
}
