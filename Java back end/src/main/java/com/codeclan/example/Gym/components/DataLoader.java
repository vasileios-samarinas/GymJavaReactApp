package com.codeclan.example.Gym.components;
import com.codeclan.example.Gym.models.*;
import com.codeclan.example.Gym.repositories.MemberRepository;
import com.codeclan.example.Gym.repositories.RoomRepository;
import com.codeclan.example.Gym.repositories.SessionRepository;
import com.codeclan.example.Gym.repositories.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    SessionRepository sessionRepository;

    @Autowired
    TrainerRepository trainerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) throws Exception{

        Member member1 = new Member("John","Mike",MemberShip.STUDENT);
        memberRepository.save(member1);

        Member member2 = new Member("John","Mikeal",MemberShip.NICE);
        memberRepository.save(member2);
    }
}
