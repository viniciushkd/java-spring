package com.java.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class JavaSpringController {

    @PostMapping()
	public ResponseEntity<?> post() {
		return new ResponseEntity<>(HttpStatus.OK);
	}
    
    @GetMapping()
	public ResponseEntity<?> get() {
		return new ResponseEntity<>(HttpStatus.OK);
	}

    @PutMapping()
	public ResponseEntity<?> put() {
		return new ResponseEntity<>(HttpStatus.OK);
	}

    @DeleteMapping()
	public ResponseEntity<?> delete() {
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
