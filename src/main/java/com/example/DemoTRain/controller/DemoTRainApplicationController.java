package com.example.DemoTRain.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.DemoTRain.model.Question;
import com.example.DemoTRain.service.DemoService;

@Controller
public class DemoTRainApplicationController {

	@Autowired
	DemoService demoservice;

	final Logger log = LoggerFactory.getLogger(DemoTRainApplicationController.class);

	/*
	 * @RequestMapping("/someurl/{num}")
	 * 
	 * @ResponseBody public ResponseEntity<List<Question>> pop(@PathVariable("num")
	 * Long num) { log.info("logged some string as ismail"); return
	 * demoservice.add(num); }
	 * 
	 * @RequestMapping("/someu/")
	 * 
	 * @ResponseBody public ResponseEntity<List<Question>> popo(@RequestParam Long
	 * num) { log.info("logged some string as ismail"); return demoservice.add(num);
	 * }
	 */		Long id=10l;

	@RequestMapping(value="/add",method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<String> pp()
	{
		return demoservice.add(id);
		
	}
	@RequestMapping(value="/get",method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Question>> ppp()
	{
		return demoservice.getting(id);
		
	}
	@RequestMapping(value="/getone",method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Question> p()
	{
		return demoservice.gettingOne(id);
		
	}
}
