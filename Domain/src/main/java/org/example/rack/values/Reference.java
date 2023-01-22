package org.example.rack.values;

import co.com.sofka.domain.generic.ValueObject;

/**
 * Esta clase representa el objeto valor Reference
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class Reference implements ValueObject<String> {
    /**
     * Representa la referencia del producto
     */
    private final String reference;

    /**
     * Representa el constructor del objeto valor Reference
     * @param reference
     */
    public Reference(String reference) {
        this.reference = reference;
    }

    /**
     * Representa el metodo para devolver el valor de la referencia
     * @return String de la referencia
     */
    @Override
    public String value(){
        return this.reference;
    }
}
