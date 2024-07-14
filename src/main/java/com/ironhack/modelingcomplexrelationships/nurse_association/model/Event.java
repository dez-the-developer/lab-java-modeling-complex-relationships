package com.ironhack.modelingcomplexrelationships.nurse_association.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date date;

    private int duration;
    private String location;
    private String title;

    @OneToMany
    private List<com.ironhack.modelingcomplexrelationships.nurseassociation.model.Guest> guests;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public <Guest> List<Guest> getGuests() {
        return (List<Guest>) guests;
    }

    public <Guest> void setGuests(List<Guest> guests) {
        this.guests = (List<com.ironhack.modelingcomplexrelationships.nurseassociation.model.Guest>) guests;
    }
}
