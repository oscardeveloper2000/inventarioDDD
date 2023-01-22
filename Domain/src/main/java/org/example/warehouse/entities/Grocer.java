package org.example.warehouse.entities;

import co.com.sofka.domain.generic.Entity;
import org.example.warehouse.values.GrocerId;
import org.example.warehouse.values.PersonalData;

/**
 * Esta clase representa la entidad Grocer
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class Grocer extends Entity<GrocerId> {
    /**
     * Representa la información personal del Grocer
     */
    private PersonalData personalData;

    /**
     * Representa el constructor de la entidad Grocer
     * @param grocerId
     * @param personalData
     */
    public Grocer(GrocerId grocerId, PersonalData personalData){
        super(grocerId);
        this.personalData = personalData;
    }

    /**
     * Representa el metodo que retorna la información personal del Grocer
     * @return Información personal del Grocer tipo PersonalData
     */
    public PersonalData PersonalData(){
        return personalData;
    }
}
