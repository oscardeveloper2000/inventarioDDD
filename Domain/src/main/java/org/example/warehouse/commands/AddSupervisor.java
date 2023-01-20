package org.example.warehouse.commands;

import co.com.sofka.domain.generic.Command;
import org.example.warehouse.values.PersonalData;
import org.example.warehouse.values.WarehouseId;

public class AddSupervisor extends Command {
    private final WarehouseId warehouseId;
    private final PersonalData personalData;

    public AddSupervisor(WarehouseId warehouseId, PersonalData personalData) {
        this.warehouseId = warehouseId;
        this.personalData = personalData;
    }

    public WarehouseId getWarehouseId() {
        return warehouseId;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }
}