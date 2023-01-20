package org.example.warehouse.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.warehouse.values.GrocerId;
import org.example.warehouse.values.PersonalData;
import org.example.warehouse.values.SupervisorId;

public class SupervisorAdded extends DomainEvent {
    private final SupervisorId supervisorId;
    private final PersonalData personalData;

    public SupervisorAdded(SupervisorId supervisorId, PersonalData personalData){
        super("org.example.warehouse.events.GrocerAdded");
        this.supervisorId = supervisorId;
        this.personalData = personalData;
    }

    public SupervisorId getSupervisorId() {
        return supervisorId;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }
}
