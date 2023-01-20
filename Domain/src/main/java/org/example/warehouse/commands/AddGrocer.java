package org.example.warehouse.commands;

import co.com.sofka.domain.generic.Command;
import org.example.warehouse.values.GrocerId;
import org.example.warehouse.values.PersonalData;

public class AddGrocer extends Command {
    private final GrocerId grocerId;
    private final PersonalData personalData;

    public AddGrocer(GrocerId grocerId, PersonalData personalData){
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
