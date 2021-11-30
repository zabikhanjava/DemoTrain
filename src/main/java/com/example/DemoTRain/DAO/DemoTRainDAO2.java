package com.example.DemoTRain.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.DemoTRain.model.Answers;

@Repository
public interface DemoTRainDAO2 extends CrudRepository<Answers,Long>{

}
