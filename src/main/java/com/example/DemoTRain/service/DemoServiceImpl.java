package com.example.DemoTRain.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.example.DemoTRain.DAO.DemoTRainDAO;
import com.example.DemoTRain.controller.DemoTRainApplicationController;
import com.example.DemoTRain.model.Question;

public class DemoServiceImpl implements DemoService{
	@Autowired
	DemoTRainDAO demodao;
	final Logger log=LoggerFactory.getLogger(DemoTRainApplicationController.class);

	@Override
	public ResponseEntity<String> add(Long num) {
		
		System.out.println("3");
		return null;
	}

	@Override
	public ResponseEntity<List<Question>> getting(Long num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Question> gettingOne(Long num) {
		// TODO Auto-generated method stub
		return null;
	}

}
