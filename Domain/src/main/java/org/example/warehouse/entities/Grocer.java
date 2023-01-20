package org.example.warehouse.entities;

import co.com.sofka.domain.generic.Entity;
import org.example.warehouse.values.GrocerId;
import org.example.warehouse.values.PersonalData;

public class Grocer extends Entity<GrocerId> {

    private PersonalData personalData;

    public Grocer(GrocerId grocerId, PersonalData personalData){
        super(grocerId);
        this.personalData = personalData;
    }

    public PersonalData PersonalData(){
        return personalData;
    }
}
