package org.example.rack.values;

import co.com.sofka.domain.generic.ValueObject;

/**
 * Esta clase representa el objeto valor State
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class State implements ValueObject<String>{

    /**
     * Representa el estado
     */
    private final String status;

    /**
     * Representa el constructor del Objeto valor State
     * @param status
     */
    public State(String status) {
        this.status = status;
    }

    /**
     * Representa el metodo para devolver el valor de la referencia en String
     * @return String del valor de referencia
     */
    @Override
    public String value(){
        return this.status;
    }
}
