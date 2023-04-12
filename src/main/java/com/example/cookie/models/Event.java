package com.example.cookie.models;

import jakarta.persistence.*;

@Entity
@Table(name = "events")
        public class Event{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(nullable = false, length = 15)
        private String date;

        @Column(nullable = false, length = 15)
        private String time;

        @Column(nullable = false, length = 100)
        private String title;

        @Column(nullable = false)
        private String guests;

        public Event() {
        }

    public Event(long id, String date, String time, String title, String guests) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.title = title;
        this.guests = guests;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGuests() {
        return guests;
    }

    public void setGuests(String guests) {
        this.guests = guests;
    }
}
