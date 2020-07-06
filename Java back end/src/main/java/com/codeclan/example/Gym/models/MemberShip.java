package com.codeclan.example.Gym.models;


public enum MemberShip {

    STUDENT("Student Account"),
    NICE("Default Account");

    private final String memberShip;


    MemberShip(String memberShip) {
        this.memberShip = memberShip;
    }

    public String getMemberShip() {
        return memberShip;
    }
}
