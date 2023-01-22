package org.example.rack.values;

import co.com.sofka.domain.generic.Identity;

/**
 * Esta clase representa el Identificador del agregado root Section
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class SectionId extends Identity {
    /**
     * Representa el constructor vacio
     */
    public SectionId(){}

    /**
     * Reprenseta el constructor de la identidad SectionId
     * @param id
     */
    private SectionId(String id){
        super(id);
    }

    /**
     * Representa el metodo para retornar una instancia
     * de SectionId
     * @param id
     * @return
     */
    public static SectionId of(String id){
        return new SectionId(id);
    }
}
