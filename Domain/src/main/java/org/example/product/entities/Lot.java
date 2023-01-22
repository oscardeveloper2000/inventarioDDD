package org.example.product.entities;

import co.com.sofka.domain.generic.Entity;
import org.example.product.values.Date;
import org.example.product.values.LotId;
/**
 * Esta clase representa la entidad Lot
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class Lot extends Entity<LotId> {
    /**
     * Representa la fecha del Lot
     */
    private Date date;

    /**
     * Representa el constructor de la entidad Lot
     * @param lotId
     * @param date
     */
    public Lot(LotId lotId, Date date){
        super(lotId);
        this.date = date;
    }

    /**
     * Representa el metodo que retorna las fechas del Lot
     * @return Las fechas pertinentes de Lot tipo Date
     */
    public Date Date(){
        return date;
    }
}
