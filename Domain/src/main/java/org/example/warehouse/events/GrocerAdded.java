package org.example.warehouse.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.warehouse.values.GrocerId;
import org.example.warehouse.values.PersonalData;

/**
 * Esta clase representa el evento GrocerAdded
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class GrocerAdded extends DomainEvent {
    /**
     * Representa el identificador de Grocer
     */
    private final GrocerId grocerId;
    /**
     * Representa la información personal del Grocer
     */
    private final PersonalData personalData;

    /**
     * Representa el constructor del comando GrocerAdded
     * @param grocerId
     * @param personalData
     */
    public GrocerAdded(GrocerId grocerId, PersonalData personalData){
        super("org.example.warehouse.events.GrocerAdded");
        this.grocerId = grocerId;
        this.personalData = personalData;
    }

    /**
     * Representa el metodo que retorna el identificador del Grocer
     * @return Identificador del Grocer tipo GrocerId
     */
    public GrocerId getGrocerId(){
        return grocerId;
    }

    /**
     * Representa el metodo que retorna la información personal del Grocer
     * @return Información personal del Grocer tipo PersonalData
     */
    public PersonalData getPersonalData(){
        return personalData;
    }
}
