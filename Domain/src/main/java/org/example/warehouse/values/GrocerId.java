package org.example.warehouse.values;

import co.com.sofka.domain.generic.Identity;

/**
 * Esta clase representa el agregado root GrocerId
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class GrocerId extends Identity {

    /**
     * Reresenta el constructor vacio
     */
    public GrocerId(){}

    /**
     * Representa el metodo para retornar una instancia de GrocerId
     * @param id
     */
    public GrocerId(String id){
        super(id);
    }

    /**
     * Representa el metodo para retornar una instancia
     * de GrocerId
     * @param id
     * @return
     */
    public static GrocerId of(String id){
        return new GrocerId(id);
    }
}
