package com.ironhack.modelingcomplexrelationships.nurse_association.repository;

import com.ironhack.modelingcomplexrelationships.nurse_association.model.Chapter;
import com.ironhack.modelingcomplexrelationships.nurseassociation.model.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
public class ChapterRepositoryTest {

    @Autowired
    private ChapterRepository chapterRepository;

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void testCreateChapter() {
        Member president = new Member();
        president.setName("John Doe");
        president.setStatus(Member.Status.ACTIVE);
        president.setRenewalDate(new java.util.Date());
        memberRepository.save(president);

        Chapter chapter = new Chapter();
        chapter.setName("Chapter 1");
        chapter.setDistrict("District 1");
        chapter.setPresident(president);
        chapterRepository.save(chapter);

        List<Chapter> chapters = chapterRepository.findAll();
        assertEquals(1, chapters.size());
        assertEquals("Chapter 1", chapters.get(0).getName());
        assertEquals("District 1", chapters.get(0).getDistrict());
        assertEquals("John Doe", chapters.get(0).getPresident().getName());
    }
}
