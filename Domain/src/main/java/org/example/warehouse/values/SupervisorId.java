package org.example.warehouse.values;

import co.com.sofka.domain.generic.Identity;

/**
 * Esta clase representa el agregado root SupervisorId
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class SupervisorId extends Identity {

    /**
     * Reresenta el constructor vacio
     */
    public SupervisorId(){}

    /**
     * Representa el metodo para retornar una instancia de SupervisorId
     * @param id
     */
    public SupervisorId(String id){
        super(id);
    }

    /**
     * Representa el metodo para retornar una instancia
     * de SupervisorId
     * @param id
     * @return
     */
    public static SupervisorId of(String id){
        return new SupervisorId(id);
    }
}
