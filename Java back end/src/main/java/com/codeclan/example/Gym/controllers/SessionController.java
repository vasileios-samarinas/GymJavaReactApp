package com.codeclan.example.Gym.controllers;
import com.codeclan.example.Gym.models.Room;
import com.codeclan.example.Gym.models.Session;
import com.codeclan.example.Gym.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessions")
public class SessionController {

    @Autowired
    SessionRepository sessionRepository;

//  READ - GET ALL SESSIONS
    @GetMapping
    public ResponseEntity<List<Session>> getAllSessions(){
        return new ResponseEntity<>(sessionRepository.findAll(), HttpStatus.OK);
    }

    //  SHOW ONE SESSION
    @GetMapping(value="/{id}")
    public ResponseEntity<List<Session>>getSession(@PathVariable Long id){
        return new ResponseEntity(sessionRepository.findById(id), HttpStatus.OK);
    }

    //  CREATE ONE SESSION
    @PostMapping
    public ResponseEntity<Session> postSession(@RequestBody Session session){
        sessionRepository.save(session);
        return new ResponseEntity(session, HttpStatus.CREATED);
    }

    //  UPDATE ONE SESSION
    @PutMapping(value = "/{id}")
    public ResponseEntity<Session> putSession(@RequestBody Session session){
        sessionRepository.save(session);
        return new ResponseEntity(session, HttpStatus.CREATED);
    }

    //  DELETE ONE SESSION
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Session> deleteSession(@PathVariable Long id){
        sessionRepository.deleteById(id);
        return new ResponseEntity(id,HttpStatus.OK);
    }

}
