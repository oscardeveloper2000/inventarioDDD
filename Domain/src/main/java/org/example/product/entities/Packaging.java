package org.example.product.entities;
import co.com.sofka.domain.generic.Entity;
import org.example.product.values.Capacity;
import org.example.product.values.Dimension;
import org.example.product.values.PackagingId;
public class Packaging extends Entity<PackagingId> {
    private Dimension dimension;
    private Capacity capacity;

    public Packaging(PackagingId entityId, Dimension dimension, Capacity capacity) {
        super(entityId);
        this.dimension = dimension;
        this.capacity = capacity;
    }

    public Dimension Dimension() {
        return dimension;
    }

    public Capacity Capacity() {
        return capacity;
    }
}
