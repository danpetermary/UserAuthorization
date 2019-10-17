package com.stackroute.cgiauth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/api/fetchrecord")
	public ResponseEntity<String> fetch()
	{
		return new ResponseEntity<String>("Welcome!!!" ,HttpStatus.OK);
	}
}
