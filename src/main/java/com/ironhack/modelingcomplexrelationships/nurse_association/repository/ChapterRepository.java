package com.ironhack.modelingcomplexrelationships.nurse_association.repository;

import com.ironhack.modelingcomplexrelationships.nurse_association.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Long> {
}
