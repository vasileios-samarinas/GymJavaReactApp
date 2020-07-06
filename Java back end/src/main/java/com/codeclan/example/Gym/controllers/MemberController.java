package com.codeclan.example.Gym.controllers;

import com.codeclan.example.Gym.models.Member;
import com.codeclan.example.Gym.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    MemberRepository memberRepository;

    @GetMapping
    public ResponseEntity<List<Member>>getAllMembers(){
        return new ResponseEntity<>(memberRepository.findAll(), HttpStatus.OK);
    }
}
