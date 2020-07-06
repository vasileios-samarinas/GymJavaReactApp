package com.codeclan.example.Gym.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "rooms")

public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "roomName")
    private String roomName;

    @Column(name = "capacity")
    private int capacity;

    @JsonIgnore
    @OneToMany(mappedBy = "room")
    private List<Session> sessions;


    public Room(String roomName, int capacity) {
        this.roomName = roomName;
        this.capacity = capacity;
        this.sessions = new ArrayList<>();
    }

    public Room(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }
}
