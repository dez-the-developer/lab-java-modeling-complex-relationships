package com.ironhack.modelingcomplexrelationships.nurse_association.repository;

import com.ironhack.modelingcomplexrelationships.nurse_association.model.Exposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpositionRepository extends JpaRepository<Exposition, Long> {
}
