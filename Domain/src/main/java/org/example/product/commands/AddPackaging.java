package org.example.product.commands;

import co.com.sofka.domain.generic.Command;
import org.example.product.values.Capacity;
import org.example.product.values.Dimension;
import org.example.product.values.ProductId;
/**
 * Esta clase representa el comando AddPackaging
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class AddPackaging extends Command {
    /**
     * Representa el identificador del Product
     */
    private final ProductId productId;
    /**
     * Representa la capacidad del empaquetado
     */
    private final Capacity capacity;
    /**
     * Representa la dimension del empaquetado
     */
    private final Dimension dimension;

    /**
     * Representa el constructor del comando AddPackaging
     * @param productId
     * @param capacity
     * @param dimension
     */
    public AddPackaging(ProductId productId, Capacity capacity, Dimension dimension) {
        this.productId = productId;
        this.capacity = capacity;
        this.dimension = dimension;
    }

    /**
     * Representa el metodo que retorna el identificador del Product
     * @return Identificador del Product tipo ProductId
     */
    public ProductId getProductId() {
        return productId;
    }

    /**
     * Representa el metodo que retorna la capacidad del Packaging
     * @return la capacidad del empaquetado
     */
    public Capacity getCapacity() {
        return capacity;
    }

    /**
     * Representa el metodo que retorna las dimensiones del Packaging
     * @return las dimensiones del empaquetado
     */
    public Dimension getDimension() {
        return dimension;
    }
}
