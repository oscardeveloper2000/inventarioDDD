package org.example.warehouse.values;

import co.com.sofka.domain.generic.Identity;

/**
 * Esta clase representa el agregado root WarehouseId
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class WarehouseId extends Identity {

    /**
     * Reresenta el constructor vacio
     */
    public WarehouseId(){}

    /**
     * Representa el metodo para retornar una instancia de WarehouseId
     * @param id
     */
    private WarehouseId(String id){
        super(id);
    }

    /**
     * Representa el metodo para retornar una instancia
     * de WarehouseId
     * @param id
     * @return
     */
    public static WarehouseId of(String id){
        return new WarehouseId(id);
    }
}
