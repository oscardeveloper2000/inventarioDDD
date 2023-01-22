package org.example.product.values;

import co.com.sofka.domain.generic.ValueObject;

/**
 * Esta clase representa el objeto valor Capacity
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class Capacity implements ValueObject<Integer>{
    /**
     * Representa el peso en número de la capacidad
     */
    private final int weight;

    /**
     * Representa el constructor del objeto valor Capacity
     * @param weight
     */
    public Capacity(int weight) {
        this.weight = weight;
    }

    /**
     * Representa el metodo para devolver el valor del peso en entero
     * @return Integer del valor peso
     */
    @Override
    public Integer value(){
        return this.weight;
    }
}
