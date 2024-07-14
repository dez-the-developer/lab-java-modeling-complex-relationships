package com.ironhack.modelingcomplexrelationships.nurse_association.model;

import jakarta.persistence.*;

import java.lang.reflect.Member;
import java.util.List;

@Entity
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String district;

    @OneToOne
    private com.ironhack.modelingcomplexrelationships.nurseassociation.model.Member president;

    @OneToMany
    private List<Member> members;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public com.ironhack.modelingcomplexrelationships.nurseassociation.model.Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = (com.ironhack.modelingcomplexrelationships.nurseassociation.model.Member) president;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
