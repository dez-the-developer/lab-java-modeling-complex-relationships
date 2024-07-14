package com.ironhack.modelingcomplexrelationships.nurse_association.model;

import jakarta.persistence.*;
import jdk.jfr.Event;

import java.util.List;

@Entity
public class Conference extends Event {
    @OneToMany
    private List<com.ironhack.modelingcomplexrelationships.nurseassociation.model.Speaker> speakers;

    // Getters and setters
    public List<com.ironhack.modelingcomplexrelationships.nurseassociation.model.Speaker> getSpeakers() {
        return speakers;
    }

    public <Speaker> void setSpeakers(List<Speaker> speakers) {
        this.speakers = (List<com.ironhack.modelingcomplexrelationships.nurseassociation.model.Speaker>) speakers;
    }
}
