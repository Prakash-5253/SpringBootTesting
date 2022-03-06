package com.example.TestTwo.repo;

import com.example.TestTwo.entity.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TraineeRepository extends JpaRepository<Trainee,String> {
    Trainee findByName(String traineeName);
}
