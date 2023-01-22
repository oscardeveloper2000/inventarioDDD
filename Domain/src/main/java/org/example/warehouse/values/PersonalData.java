package org.example.warehouse.values;

import co.com.sofka.domain.generic.ValueObject;

/**
 * Esta clase representa el Objeto valor PersonalData
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class PersonalData implements ValueObject<PersonalData.Props> {
    /**
     * Representa el nombre de las entidades
     */
    private final String name;
    /**
     * Representa el apellido de las entidades
     */
    private final String lastName;
    /**
     * Representa el correo de las entidades
     */
    private final String email;

    /**
     * Representa el constructor del objeto valor PersonalData
     * @param name
     * @param lastName
     * @param email
     */
    public PersonalData(String name, String lastName, String email) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    /**
     * Representa el metodo para devolver en un solo conjunto
     * los valores de los parametros de PersonalData
     * @return
     */
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

    /**
     * Representa la Interfaz para la manipulación de los
     * atributos de Dimension
     */
    public interface Props {
        String name();
        String lastName();
        String email();
    }
}
