package org.example.product.commands;

import co.com.sofka.domain.generic.Command;
import org.example.product.values.Capacity;
import org.example.product.values.Dimension;
import org.example.product.values.PackagingId;

public class AddPackaging extends Command {
    private final PackagingId packagingId;
    private final Capacity capacity;
    private final Dimension dimension;

    public AddPackaging(PackagingId packagingId, Capacity capacity, Dimension dimension) {
        this.packagingId = packagingId;
        this.capacity = capacity;
        this.dimension = dimension;
    }

    public PackagingId getPackagingId() {
        return packagingId;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
