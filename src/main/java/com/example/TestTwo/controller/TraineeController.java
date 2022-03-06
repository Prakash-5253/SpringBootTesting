package com.example.TestTwo.controller;

import com.example.TestTwo.entity.Trainee;
import com.example.TestTwo.repo.TraineeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TraineeController {
    @Autowired
    TraineeRepository traineeRepository;
    @PostMapping("/add")
    public Trainee addTrainee(@RequestBody Trainee trainee){
        return traineeRepository.save(trainee);

    }
    @GetMapping("/get/{id}")
     public Trainee getTraineeById(@PathVariable("id") String id) {
        Trainee tr=new Trainee();
        tr=traineeRepository.getById(id);
        return tr;
     }
     @GetMapping("/getAll")
     public List<Trainee> getAll(){
        List<Trainee> trr=new ArrayList<>();
        trr=traineeRepository.findAll();
        return  trr;
     }
     @GetMapping("/getByName/{traineeName}")
     public Trainee getByName(@PathVariable("traineeName") String traineeName){
        Trainee ten= traineeRepository.findByName(traineeName);
return ten;
     }
}
