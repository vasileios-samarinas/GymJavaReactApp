package com.codeclan.example.Gym.models;


public enum MemberShip {

    STUDENT("Student MemberShip"),
    BASIC("Basic MemberShip"),
    PLUS("Plus MemberShip");


    private final String memberShip;

    MemberShip(String memberShip){
        this.memberShip =memberShip;
    }
}
