package org.example.rack.values;

import co.com.sofka.domain.generic.Identity;

/**
 * Esta clase representa el Identificador del agregado root Rack
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class RackId extends Identity {

    /**
     * Reresenta el constructor vacio
     */
    public RackId(){}

    /**
     * Reprenseta el constructor de la identidad RackId
     * @param id
     */
    private RackId(String id){
        super(id);
    }

    /**
     * Representa el metodo para retornar una instancia
     * de RackId
     * @param id
     * @return
     */
    public static RackId of(String id){
        return new RackId(id);
    }
}
