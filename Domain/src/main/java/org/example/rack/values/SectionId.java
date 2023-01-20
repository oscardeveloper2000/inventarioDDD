package org.example.rack.values;

import co.com.sofka.domain.generic.Identity;

public class SectionId extends Identity {
    public SectionId(){}

    private SectionId(String id){
        super(id);
    }

    public static SectionId of(String id){
        return new SectionId(id);
    }
}
