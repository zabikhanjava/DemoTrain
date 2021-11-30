package com.example.DemoTRain.DAO;

import org.springframework.stereotype.Repository;

import com.example.DemoTRain.model.Question;

import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

@Repository
public interface DemoTRainDAO extends CrudRepository<Question,Long>{
	
	@Query("select u from Question u")
	public List<Question> questioning();
	
	@Query(value="select u from Question u",nativeQuery = true)
	public List<Question> questioninginnative();
}
