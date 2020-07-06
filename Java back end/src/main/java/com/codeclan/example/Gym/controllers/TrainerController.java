package com.codeclan.example.Gym.controllers;


import com.codeclan.example.Gym.models.Room;
import com.codeclan.example.Gym.models.Trainer;
import com.codeclan.example.Gym.repositories.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trainers")
public class TrainerController {

    @Autowired
    TrainerRepository trainerRepository;

    @GetMapping
    public ResponseEntity<List<Trainer>>getAllTrainers(){
        return new ResponseEntity<>(trainerRepository.findAll(), HttpStatus.OK);
    }

}
