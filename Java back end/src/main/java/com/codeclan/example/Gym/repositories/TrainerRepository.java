package com.codeclan.example.Gym.repositories;


import com.codeclan.example.Gym.models.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer,Long> {
}
