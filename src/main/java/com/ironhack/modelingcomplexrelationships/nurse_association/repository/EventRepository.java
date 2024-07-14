package com.ironhack.modelingcomplexrelationships.nurse_association.repository;

import com.ironhack.modelingcomplexrelationships.nurse_association.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
