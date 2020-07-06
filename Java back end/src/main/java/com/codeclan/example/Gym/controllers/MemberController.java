package com.codeclan.example.Gym.controllers;

import com.codeclan.example.Gym.models.Member;
import com.codeclan.example.Gym.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value="/{id}")
    public ResponseEntity<Member> getMember(@PathVariable Long id) {
        return new ResponseEntity(memberRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Member> postMember(@RequestBody Member member) {
        memberRepository.save(member);
        return new ResponseEntity<>(member, HttpStatus.CREATED);
    }


}
