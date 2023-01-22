package org.example.warehouse.entities;

import co.com.sofka.domain.generic.Entity;
import org.example.warehouse.values.GrocerId;
import org.example.warehouse.values.PersonalData;
import org.example.warehouse.values.SupervisorId;

/**
 * Esta clase representa la entidad Supervisor
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class Supervisor extends Entity<SupervisorId> {
    /**
     * Representa la información personal del Supervisor
     */
    private PersonalData personalData;

    /**
     * Representa el constructor de la entidad Supervisor
     * @param supervisorId
     * @param personalData
     */
    public Supervisor(SupervisorId supervisorId, PersonalData personalData){
        super(supervisorId);
        this.personalData = personalData;
    }

    /**
     * Representa el metodo que retorna la información personal del Supervisor
     * @return Información personal del Grocer tipo PersonalData
     */
    public PersonalData PersonalData(){
        return personalData;
    }
}
