package com.ironhack.modelingcomplexrelationships.nurse_association.repository;

import com.ironhack.modelingcomplexrelationships.nurse_association.model.Conference;
import com.ironhack.modelingcomplexrelationships.nurse_association.model.Event;
import com.ironhack.modelingcomplexrelationships.nurseassociation.model.Guest;
import com.ironhack.modelingcomplexrelationships.nurseassociation.model.Speaker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
public class EventRepositoryTest {

    @Autowired
    private com.ironhack.modelingcomplexrelationships.nurse_association.repository.EventRepository eventRepository;

    @Autowired
    private com.ironhack.modelingcomplexrelationships.nurseassociation.repository.GuestRepository guestRepository;

    @Autowired
    private com.ironhack.modelingcomplexrelationships.nurseassociation.repository.SpeakerRepository speakerRepository;

    @Test
    public <Conference> void testCreateConference() {
        Speaker speaker = new Speaker();
        speaker.setName("Jane Doe");
        speaker.setPresentationDuration(60);
        speakerRepository.save(speaker);

        Guest guest = new Guest();
        guest.setName("Guest 1");
        guest.setStatus(Guest.Status.ATTENDING);
        guestRepository.save(guest);

        Conference conference = new Conference();
        conference.setDate(new Date());
        conference.setDuration(120);
        conference.setLocation("Location 1");
        conference.setTitle("Conference 1");

        List<Speaker> speakers = new ArrayList<>();
        speakers.add(speaker);
        conference.setSpeakers(speakers);

        List<Guest> guests = new ArrayList<>();
        guests.add(guest);
        conference.setGuests(guests);

        eventRepository.save(conference);

        List<Event> events = eventRepository.findAll();
        assertEquals(1, events.size());
        assertEquals("Conference 1", events.get(0).getTitle());
        assertEquals("Location 1", events.get(0).getLocation());
        assertEquals(1, ((Conference) events.get(0)).getSpeakers().size());
        assertEquals("Jane Doe", ((Conference) events.get(0)).getSpeakers().get(0).getName());
        assertEquals(1, events.get(0).getGuests().size());
        assertEquals("Guest 1", events.get(0).getGuests().get(0).getName());
    }
}
