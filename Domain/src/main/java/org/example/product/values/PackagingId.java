package org.example.product.values;

import co.com.sofka.domain.generic.Identity;
import org.example.rack.values.LevelId;

public class PackagingId extends Identity {

    public PackagingId() {
    }
    public PackagingId(String id) {
        super(id);
    }

    public static PackagingId of(String id) {
        return new  PackagingId(id);
    }
}
