package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Random;

@RestController
@RequestMapping(value = "/Test")
public class TestController {
	
	@CrossOrigin
	@GetMapping(value = "/testController")
	public ResponseEntity<Random> testController() {
//		return new ResponseEntity<>("Test", HttpStatus.OK);
		return new ResponseEntity<>(new Random("Some Random String"), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/test2", method = RequestMethod.POST)
	public ResponseEntity<String> testController2() {
		return new ResponseEntity<>("Test Method Success", HttpStatus.OK);
	}

}
