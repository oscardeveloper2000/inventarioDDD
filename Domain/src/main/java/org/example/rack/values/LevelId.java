package org.example.rack.values;

import co.com.sofka.domain.generic.Identity;

/**
 * Esta clase representa el Identificador de la entidad Level
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class LevelId extends Identity {

    /**
     * Representa el constructor vacio
     */
    public LevelId() {
    }

    /**
     * Reprenseta el constructor de la identidad LevelId
     * @param id
     */
    public LevelId(String id) {
        super(id);
    }

    /**
     * Representa el metodo para retornar una instancia
     * de LevelId
     * @param id
     * @return
     */
    public static LevelId of(String id) {
        return new LevelId(id);
    }

}
