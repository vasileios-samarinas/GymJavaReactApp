package com.codeclan.example.Gym.controllers;


import com.codeclan.example.Gym.models.Member;
import com.codeclan.example.Gym.models.Session;
import com.codeclan.example.Gym.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sessions")
public class SessionController {

    @Autowired
    SessionRepository sessionRepository;

    @GetMapping
    public ResponseEntity<List<Session>> getAllSessions(){
        return new ResponseEntity<>(sessionRepository.findAll(), HttpStatus.OK);
    }
}
