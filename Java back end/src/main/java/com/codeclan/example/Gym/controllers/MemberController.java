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

//  READ - GET ALL MEMBERS
    @GetMapping
    public ResponseEntity<List<Member>>getAllMembers(){
        return new ResponseEntity<>(memberRepository.findAll(), HttpStatus.OK);
    }

//  SHOW ONE MEMBER
    @GetMapping(value="/{id}")
    public ResponseEntity<Member> getMember(@PathVariable Long id) {
        return new ResponseEntity(memberRepository.findById(id), HttpStatus.OK);
    }

//  CREATE ONE MEMBER
    @PostMapping
    public ResponseEntity<Member> postMember(@RequestBody Member member) {
        memberRepository.save(member);
        return new ResponseEntity<>(member, HttpStatus.CREATED);
    }

//  UPDATE ONE MEMBER
    @PutMapping(value="/{id}")
    public ResponseEntity<Member> putMember(@RequestBody Member member){
        memberRepository.save(member);
        return new ResponseEntity<>(member, HttpStatus.OK);
    }

//  DELETE ONE MEMBER
    @DeleteMapping(value="/{id}")
    public ResponseEntity<Long> deleteMember(@PathVariable Long id){
        memberRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }


}
