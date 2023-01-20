package org.example.warehouse.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.warehouse.values.GrocerId;
import org.example.warehouse.values.PersonalData;

public class GrocerAdded extends DomainEvent {
    private final GrocerId grocerId;
    private final PersonalData personalData;

    public GrocerAdded(GrocerId grocerId, PersonalData personalData){
        super("org.example.warehouse.events.GrocerAdded");
        this.grocerId = grocerId;
        this.personalData = personalData;
    }

    public GrocerId getGrocerId(){
        return grocerId;
    }

    public PersonalData getPersonalData(){
        return personalData;
    }
}
