package com.codeclan.example.Gym.models;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "sessions")

public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "start_time")
    private Timestamp start_time;

    @Column(name = "duration")
    private int duration;

    @Column(name = "room")
    private Room room;

    public Session(String type, Timestamp start_time, int duration, Room room) {
        this.type = type;
        this.start_time = start_time;
        this.duration = duration;
        this.room = room;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Timestamp getStart_time() {
        return start_time;
    }

    public void setStart_time(Timestamp start_time) {
        this.start_time = start_time;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
