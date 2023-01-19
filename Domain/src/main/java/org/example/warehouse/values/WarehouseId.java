package org.example.warehouse.values;

import co.com.sofka.domain.generic.Identity;

public class WarehouseId extends Identity {

    public WarehouseId(){}

    private WarehouseId(String id){
        super(id);
    }

    public static WarehouseId of(String id){
        return new WarehouseId(id);
    }
}
