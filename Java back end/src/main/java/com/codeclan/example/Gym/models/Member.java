package com.codeclan.example.Gym.models;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column
    private MemberShip memberShip;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "sessions_members",
            joinColumns = { @JoinColumn(
                    name = "member_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = { @JoinColumn(
                    name = "session_id",
                    nullable = false,
                    updatable = false)
            })
    private List<Session> sessions;

    public Member(String firstName, String lastName, MemberShip memberShip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberShip = memberShip;
        this.sessions = new ArrayList<>();
    }

    public Member(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public MemberShip getMemberShip() {
        return memberShip;
    }

    public void setMemberShip(MemberShip memberShip) {
        this.memberShip = memberShip;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    public void addSessionToMember(Session session){
        this.sessions.add(session);
    }



}
