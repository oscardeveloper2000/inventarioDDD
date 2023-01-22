package org.example.rack.values;

import co.com.sofka.domain.generic.ValueObject;

/**
 * Esta clase representa el objeto valor LoadCapacity
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class LoadCapicity implements ValueObject<Integer>{
    /**
     * Representa el peso en numero de la carga
     */
    private final int load;

    /**
     * Representa el constructor del objeto valor LoadCapacity
     * @param load
     */
    public LoadCapicity(int load) {
        this.load = load;
    }

    public static LoadCapicity of(int load) {
        return new LoadCapicity(load);
    }

    /**
     * Representa el metodo para devolver el valor del peso en entero
     * @return Integer del valor peso
     */
    @Override
    public Integer value(){
        return this.load;
    }
}
