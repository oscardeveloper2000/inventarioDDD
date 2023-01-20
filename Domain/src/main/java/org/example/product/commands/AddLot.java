package org.example.product.commands;

import co.com.sofka.domain.generic.Command;
import org.example.product.values.Date;
import org.example.product.values.LotId;

public class AddLot extends Command {
    private final LotId lotId;
    private final Date date;

    public AddLot(LotId lotId, Date date) {
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
