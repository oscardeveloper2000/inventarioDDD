package org.example.product.values;

import co.com.sofka.domain.generic.Identity;
import org.example.rack.values.LevelId;

/**
 * Esta clase representa el Identificador de la entidad Packaging
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class PackagingId extends Identity {
    /**
     * Representa el constructor vacio
     */
    public PackagingId() {
    }
    /**
     * Reprenseta el constructor de la identidad PackagingId
     * @param id
     */
    public PackagingId(String id) {
        super(id);
    }

    /**
     * Representa el metodo para retornar una instancia
     * de PackagingId
     * @param id
     * @return
     */
    public static PackagingId of(String id) {
        return new  PackagingId(id);
    }
}
