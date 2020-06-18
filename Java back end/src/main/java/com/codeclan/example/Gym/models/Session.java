package com.codeclan.example.Gym.models;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

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

    @Column(name = "trainer")
    private Trainer trainer;

    @ManyToOne
    @JoinColumn(name="member_id", nullable = false)
    private List<Member> members;


    public Session(String type, Timestamp start_time, int duration, Room room, Trainer trainer) {
        this.type = type;
        this.start_time = start_time;
        this.duration = duration;
        this.room = room;
        this.trainer = trainer;
        this.members = new ArrayList<>();
    }

    public Session(){}

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

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
