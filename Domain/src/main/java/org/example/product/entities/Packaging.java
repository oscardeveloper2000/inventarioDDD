package org.example.product.entities;
import co.com.sofka.domain.generic.Entity;
import org.example.product.values.Capacity;
import org.example.product.values.Dimension;
import org.example.product.values.PackagingId;
/**
 * Esta clase representa la entidad Packaging
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class Packaging extends Entity<PackagingId> {
    /**
     * Representa las dimensiones del Packaging
     */
    private Dimension dimension;
    /**
     * Representa la capacidad del Packaging
     */
    private Capacity capacity;

    /**
     * Representa el constructor de la entidad Packaging
     * @param packagingId
     * @param dimension
     * @param capacity
     */
    public Packaging(PackagingId packagingId, Dimension dimension, Capacity capacity) {
        super(packagingId);
        this.dimension = dimension;
        this.capacity = capacity;
    }

    /**
     * Representa el metodo que retorna las dimensiones del Packaging
     * @return Las dimensiones
     */
    public Dimension Dimension() {
        return dimension;
    }

    public Capacity Capacity() {
        return capacity;
    }
}
