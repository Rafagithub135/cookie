package com.example.cookie.repositories;

import com.example.cookie.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
    Event findEventById(long id);
}