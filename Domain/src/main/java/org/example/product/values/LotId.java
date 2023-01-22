package org.example.product.values;

import co.com.sofka.domain.generic.Identity;

/**
 * Esta clase representa el Identificador de la entidad Lot
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class LotId extends Identity {
    /**
     * Representa el constructor vacio
     */
    public LotId(){}

    /**
     * Reprenseta el constructor de la identidad LotId
     * @param id
     */
    private LotId(String id){
        super(id);
    }

    /**
     * Representa el metodo para retornar una instancia
     * de LotId
     * @param id
     * @return
     */
    public static LotId of(String id){
        return new LotId(id);
    }
}
