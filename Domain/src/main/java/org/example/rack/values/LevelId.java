package org.example.rack.values;

import co.com.sofka.domain.generic.Identity;

public class LevelId extends Identity {

    public LevelId() {
    }
    public LevelId(String id) {
        super(id);
    }

    public static LevelId of(String id) {
        return new LevelId(id);
    }

}
