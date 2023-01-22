package org.example.warehouse.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.warehouse.values.GrocerId;
import org.example.warehouse.values.PersonalData;
import org.example.warehouse.values.SupervisorId;

/**
 * Esta clase representa el evento SupervisorAdded
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class SupervisorAdded extends DomainEvent {
    /**
     * Representa el identificador de Supervisor
     */
    private final SupervisorId supervisorId;
    /**
     * Representa la información personal del Grocer
     */
    private final PersonalData personalData;

    /**
     * Representa el constructor del comando SupervisorAdded
     * @param supervisorId
     * @param personalData
     */

    public SupervisorAdded(SupervisorId supervisorId, PersonalData personalData){
        super("org.example.warehouse.events.GrocerAdded");
        this.supervisorId = supervisorId;
        this.personalData = personalData;
    }

    /**
     * Representa el metodo que retorna el identificador del Supervisor
     * @return Identificador del Supervisor tipo SupervisorId
     */
    public SupervisorId getSupervisorId() {
        return supervisorId;
    }

    /**
     * Representa el metodo que retorna la información personal del Grocer
     * @return Información personal del Grocer tipo PersonalData
     */
    public PersonalData getPersonalData() {
        return personalData;
    }
}
