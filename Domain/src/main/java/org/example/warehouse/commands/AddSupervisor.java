package org.example.warehouse.commands;

import co.com.sofka.domain.generic.Command;
import org.example.warehouse.values.PersonalData;
import org.example.warehouse.values.SupervisorId;

public class AddSupervisor extends Command {
    private final SupervisorId supervisorId;
    private final PersonalData personalData;

    public AddSupervisor(SupervisorId supervisorId, PersonalData personalData) {
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
