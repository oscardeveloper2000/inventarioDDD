package org.example.warehouse.entities;

import co.com.sofka.domain.generic.Entity;
import org.example.warehouse.values.GrocerId;
import org.example.warehouse.values.PersonalData;
import org.example.warehouse.values.SupervisorId;

public class Supervisor extends Entity<SupervisorId> {
    private PersonalData personalData;

    public Supervisor(SupervisorId supervisorId, PersonalData personalData){
        super(supervisorId);
        this.personalData = personalData;
    }

    public PersonalData PersonalData(){
        return personalData;
    }
}
