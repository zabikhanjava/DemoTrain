package com.example.DemoTRain.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.HibernateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

import com.example.DemoTRain.DAO.DemoTRainDAO;
import com.example.DemoTRain.DAO.DemoTRainDAO2;
import com.example.DemoTRain.controller.DemoTRainApplicationController;
import com.example.DemoTRain.model.Answers;
import com.example.DemoTRain.model.Question;

public class DemoServiceImpl2 implements DemoService {
	@Autowired
	DemoTRainDAO demodao;
	@Autowired
	DemoTRainDAO2 demodao2;
	final Logger log = LoggerFactory.getLogger(DemoTRainApplicationController.class);

	@Override
	@Transactional
	public ResponseEntity<String> add(Long num) {
		Answers answers1 = new Answers();
		answers1.setAnswer("it is a language");
		Answers answers2 = new Answers();
		answers2.setAnswer("it is a JVM");
		Answers answers3 = new Answers();
		answers3.setAnswer("it is a BYTECODE");
		Answers answers4 = new Answers();
		answers4.setAnswer("it is a OOPS");
		Answers answers5 = new Answers();
		answers5.setAnswer("it is a AWESOME");
		Answers answers6 = new Answers();
		answers6.setAnswer("it is a spring");
		Answers answers7 = new Answers();
		answers7.setAnswer("it is a dont not");
		ArrayList<Answers> list = new ArrayList<Answers>();
		list.add(answers1);
		list.add(answers2);
		list.add(answers3);
		list.add(answers4);
		list.add(answers5);
		list.add(answers6);
		list.add(answers7);
		Question question = new Question();
		question.setQuestion("what is Java");
		answers1.setQuestion(question);
		answers2.setQuestion(question);
		answers3.setQuestion(question);
		answers4.setQuestion(question);
		answers5.setQuestion(question);
		answers6.setQuestion(question);
		answers7.setQuestion(question);
		question.setAnswers(list);
		demodao.save(question);
		ResponseEntity<String> res = new ResponseEntity<String>("stored-saved", HttpStatus.ACCEPTED);
		return res;
	}

	@Override
	public ResponseEntity<List<Question>> getting(Long num) {
		try {
			List<Question> list = demodao.questioning();
			ResponseEntity<List<Question>> res = new ResponseEntity(list, HttpStatus.ACCEPTED);
			return res;
		} catch (HibernateException e) {
			log.info("{}:", e);
			ResponseEntity<List<Question>> res = new ResponseEntity(null, HttpStatus.BAD_REQUEST);
			return res;

		}
	}

	@Override
	public ResponseEntity<Question> gettingOne(Long num) {
		Question listy=null;
		try {
			Optional<Question> list = demodao.findById(1l);
			if(list.isPresent())
				{
				listy=list.get();
				}
			ResponseEntity res = new ResponseEntity(listy, HttpStatus.ACCEPTED);
			return res;
		} catch (HibernateException e) {
			log.info("this is: {0}", e);
			ResponseEntity res = new ResponseEntity(null, HttpStatus.BAD_REQUEST);
			return res;

		}
	}

}
