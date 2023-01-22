package org.example.product.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.product.values.*;
/**
 * Esta clase representa el evento PackagingAdded
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class PackagingAdded extends DomainEvent {
    /**
     * Representa el identificador del empaquetado
     */
    private final PackagingId packagingId;
    /**
     * Representa la capacidad del empaquetado
     */
    private final Capacity capacity;
    /**
     * Representa la dimension del empaquetado
     */
    private final Dimension dimension;

    /**
     * Representa el constructor del evento PackagingAdded
     * @param packagingId
     * @param capacity
     * @param dimension
     */
    public PackagingAdded(PackagingId packagingId, Capacity capacity, Dimension dimension) {
        super("org.example.product.events.PackagingAdded");
        this.packagingId = packagingId;
        this.capacity = capacity;
        this.dimension = dimension;
    }

    /**
     * Representa el metodo que retorna el identificador del Packaging
     * @return Identificador del Packaging tipo PackagingId
     */
    public PackagingId getPackagingId() {
        return packagingId;
    }

    /**
     * Representa el metodo que retorna la capacidad del Packaging
     * @return la capacidad del Packaging tipo Capacity
     */
    public Capacity getCapacity() {
        return capacity;
    }

    /**
     * Representa el metodo que retorna la dimensión del Packaging
     * @return las dimensiones del Packaging tipo Dimension
     */
    public Dimension getDimension() {
        return dimension;
    }
}
