package org.example.warehouse.commands;

import co.com.sofka.domain.generic.Command;
import org.example.warehouse.values.PersonalData;
import org.example.warehouse.values.WarehouseId;

/**
 * Esta clase representa el comando AddGrocer
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class AddGrocer extends Command {
    /**
     * Representa el stock del Warehouse
     */
    private final WarehouseId warehouseId;
    /**
     * Representa la información personal del Grocer
     */
    private final PersonalData personalData;

    /**
     * Representa el constructor del comando AddGrocer
     * @param warehouseId
     * @param personalData
     */
    public AddGrocer(WarehouseId warehouseId, PersonalData personalData){
        this.warehouseId = warehouseId;
        this.personalData = personalData;
    }

    /**
     * Representa el metodo que retorna el identificador del Warehouse
     * @return Identificador del Warehouse tipo WarehouseId
     */
    public WarehouseId getWarehouseId(){
        return warehouseId;
    }

    /**
     * Representa el metodo que retorna la información personal del Grocer
     * @return Información personal del Grocer tipo PersonalData
     */
    public PersonalData getPersonalData(){
        return personalData;
    }
}
