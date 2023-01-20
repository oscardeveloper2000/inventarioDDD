package org.example.product.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.product.values.Date;
import org.example.product.values.LotId;

public class LotAdded extends DomainEvent {
    private final LotId lotId;
    private final Date date;

    public LotAdded(LotId lotId, Date date) {
        super("org.example.product.events.LotAdded");
        this.lotId = lotId;
        this.date = date;
    }

    public LotId getLotId(){
        return lotId;
    }

    public Date getDate(){
        return date;
    }
}
