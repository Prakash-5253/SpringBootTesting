package com.example.TestTwo.controller;

import com.example.TestTwo.entity.Trainee;
import com.example.TestTwo.repo.TraineeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TraineeControllerTest {

    @Autowired
    TraineeController traineeController;
    @Autowired
    TraineeRepository traineeRepository;
    @Test
    @Transactional
    void getByIdTest(){
        assertNotNull(traineeController.getTraineeById("c0d0d9dd-2274-4d57-a5f0-01e46ad46324"));
   assertEquals("hari",traineeRepository.getById("c0d0d9dd-2274-4d57-a5f0-01e46ad46324").getName());
    }

    @Test
    void getAllTest(){
        List<Trainee> trainee=traineeRepository.findAll();
        assertThat(trainee).isNotNull();
    }
    @Test
    void addDetailsTest(){
   Trainee tan=new Trainee();
   tan.setName("AMIR");
   tan.setDomain("wordpress");
   traineeRepository.save(tan);
   assertNotNull(traineeRepository.findById("9ebfe375-9ea6-49d3-984e-75eadef90389").get());

    }
    @Test
   void updateDetailsTest(){
        Trainee tss=traineeRepository.findById("9ebfe375-9ea6-49d3-984e-75eadef90389").get();
        tss.setName("alagar");
        tss.setDomain("dataScience");
        traineeRepository.save(tss);
        assertNotEquals("wordpress",traineeRepository.findById("9ebfe375-9ea6-49d3-984e-75eadef90389").get().getDomain());

   }
   @Test
   void DeleteDetailsTest(){
       traineeRepository.deleteById("9ebfe375-9ea6-49d3-984e-75eadef90389");
       assertThat(traineeRepository.existsById("9ebfe375-9ea6-49d3-984e-75eadef90389")).isFalse();
   }
}