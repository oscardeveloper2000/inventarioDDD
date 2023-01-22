package org.example.product.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.product.values.Date;
import org.example.product.values.LotId;
/**
 * Esta clase representa el evento LotAdded
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class LotAdded extends DomainEvent {
    /**
     * Representa el identificador del lote
     */
    private final LotId lotId;
    /**
     * Representa la fecha del lote
     */
    private final Date date;

    /**
     * Representa el constructor del evento LotAdded
     * @param lotId
     * @param date
     */
    public LotAdded(LotId lotId, Date date) {
        super("org.example.product.events.LotAdded");
        this.lotId = lotId;
        this.date = date;
    }

    /**
     * Representa el metodo que retorna el identificador del Lot
     * @return Identificador del Lot tipo LotId
     */
    public LotId getLotId(){
        return lotId;
    }

    /**
     * Representa el metodo que retorna la fecha del Lot
     * @return las fechas pertinentes del lote
     */
    public Date getDate(){
        return date;
    }
}
