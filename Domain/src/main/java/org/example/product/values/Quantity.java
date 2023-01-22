package org.example.product.values;

import co.com.sofka.domain.generic.ValueObject;

/**
 * Esta clase representa el objeto valor Quantity
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class Quantity implements ValueObject<Integer> {
    /**
     * Representa el peso en número de la cantidad
     */
    private final int quantity;

    /**
     * Representa el constructor del objeto valor Quantity
     * @param quantity
     */
    public Quantity(int quantity){
        this.quantity = quantity;
    }

    /**
     * Representa el metodo para retornar una instancia
     * de Quantity
     * @param quantity
     * @return
     */
    public static Quantity of(int quantity){
        return new Quantity(quantity);
    }

    /**
     * Representa el metodo para devolver el valor de la cantidad en entero
     * @return Integer del valor cantidad
     */
    @Override
    public Integer value(){
        return this.quantity;
    }
}
