package org.example.product.values;

import co.com.sofka.domain.generic.Identity;

/**
 * Esta clase representa el Identificador del agregado root Product
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class ProductId extends Identity {
    /**
     * Representa el constructor vacio
     */
    public ProductId(){}

    /**
     * Reprenseta el constructor de la identidad ProductId
     * @param id
     */
    private ProductId(String id){
        super(id);
    }

    /**
     * Representa el metodo para retornar una instancia
     * de ProductId
     * @param id
     * @return
     */
    public static ProductId of(String id){
        return new ProductId(id);
    }
}
