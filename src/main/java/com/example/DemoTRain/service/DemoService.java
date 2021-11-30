package com.example.DemoTRain.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.DemoTRain.model.Question;

public interface DemoService {
	public  ResponseEntity<String> add(Long num);
	public  ResponseEntity<List<Question>> getting(Long num);
	ResponseEntity<Question> gettingOne(Long num);

}
