package com.codeclan.example.Gym.controllers;


import com.codeclan.example.Gym.models.Room;
import com.codeclan.example.Gym.models.Session;
import com.codeclan.example.Gym.models.Trainer;
import com.codeclan.example.Gym.repositories.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainers")
public class TrainerController {

    @Autowired
    TrainerRepository trainerRepository;

//  READ - GET ALL TRAINERS
    @GetMapping
    public ResponseEntity<List<Trainer>>getAllTrainers(){
        return new ResponseEntity<>(trainerRepository.findAll(), HttpStatus.OK);
    }

    //  SHOW ONE TRAINER
    @GetMapping(value="/{id}")
    public ResponseEntity<List<Trainer>>getTrainer(@PathVariable Long id){
        return new ResponseEntity(trainerRepository.findById(id), HttpStatus.OK);
    }

    //  CREATE ONE TRAINER
    @PostMapping
    public ResponseEntity<Trainer> postTrainer(@RequestBody Trainer trainer){
        trainerRepository.save(trainer);
        return new ResponseEntity(trainer, HttpStatus.CREATED);
    }

    //  UPDATE ONE SESSION
    @PutMapping(value = "/{id}")
    public ResponseEntity<Session> putTrainer(@RequestBody Trainer trainer){
        trainerRepository.save(trainer);
        return new ResponseEntity(trainer, HttpStatus.CREATED);
    }

    //  DELETE ONE SESSION
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Session> deleteTrainer(@PathVariable Long id){
        trainerRepository.deleteById(id);
        return new ResponseEntity(id,HttpStatus.OK);
    }


}
