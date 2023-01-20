package org.example.product.entities;

import co.com.sofka.domain.generic.Entity;
import org.example.product.values.Date;
import org.example.product.values.LotId;

public class Lot extends Entity<LotId> {

    private Date date;

    public Lot(LotId lotId, Date date){
        super(lotId);
        this.date = date;
    }

    public Date Date(){
        return date;
    }
}
