package com.codeclan.example.Gym.models;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "sessions")

public class Session {

    private String type;

    private Timestamp start_time;

    private int duration;

    private Room room;



}
