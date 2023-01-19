package org.example.warehouse.values;

import co.com.sofka.domain.generic.ValueObject;



public class PersonalData implements ValueObject<PersonalData.Props> {
    private final String name;
    private final String lastName;
    private final String email;

    public PersonalData(String name, String lastName, String email) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public PersonalData.Props value() {
        return new Props() {
            @Override
            public String name() { return name; }
            @Override
            public String lastName() {
                return lastName;
            }
            @Override
            public String email() {
                return email;
            }
        };
    }

    public interface Props {
        String name();
        String lastName();
        String email();
    }
}
