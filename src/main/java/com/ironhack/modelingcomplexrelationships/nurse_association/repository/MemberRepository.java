package com.ironhack.modelingcomplexrelationships.nurseassociation.repository;

import com.ironhack.modelingcomplexrelationships.nurseassociation.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
