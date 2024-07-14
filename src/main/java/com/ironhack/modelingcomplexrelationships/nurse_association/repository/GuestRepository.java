package com.ironhack.modelingcomplexrelationships.nurseassociation.repository;

import com.ironhack.modelingcomplexrelationships.nurseassociation.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
}
