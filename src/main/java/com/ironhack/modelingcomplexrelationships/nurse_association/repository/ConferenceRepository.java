package com.ironhack.modelingcomplexrelationships.nurse_association.repository;

import com.ironhack.modelingcomplexrelationships.nurse_association.model.Conference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}
