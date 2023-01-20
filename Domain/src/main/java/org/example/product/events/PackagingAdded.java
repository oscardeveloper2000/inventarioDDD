package org.example.product.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.example.product.values.*;

public class PackagingAdded extends DomainEvent {
    private final PackagingId packagingId;
    private final Capacity capacity;
    private final Dimension dimension;

    public PackagingAdded(PackagingId packagingId, Capacity capacity, Dimension dimension) {
        super("org.example.product.events.PackagingAdded");
        this.packagingId = packagingId;
        this.capacity = capacity;
        this.dimension = dimension;
    }
}
