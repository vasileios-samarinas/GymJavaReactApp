package com.codeclan.example.Gym.controllers;


import com.codeclan.example.Gym.models.Member;
import com.codeclan.example.Gym.models.Room;
import com.codeclan.example.Gym.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @Autowired
    RoomRepository roomRepository;

//  READ - GET ALL ROOMS
    @GetMapping
    public ResponseEntity<List<Room>>getAllRooms(){
        return new ResponseEntity<>(roomRepository.findAll(), HttpStatus.OK);
    }

//  SHOW ONE ROOM
    @GetMapping(value="/{id}")
    public ResponseEntity<List<Room>>getRoom(@PathVariable Long id){
        return new ResponseEntity(roomRepository.findById(id), HttpStatus.OK);
    }
}
