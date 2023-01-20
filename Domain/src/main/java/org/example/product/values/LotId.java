package org.example.product.values;

import co.com.sofka.domain.generic.Identity;

public class LotId extends Identity {

    public LotId(){}

    private LotId(String id){
        super(id);
    }

    public static LotId of(String id){
        return new LotId(id);
    }
}
