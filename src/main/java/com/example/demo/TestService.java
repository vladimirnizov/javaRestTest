package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*")
@RequestMapping(value = "test")
@RestController
public class TestService {	
	@RequestMapping( value = "/hello" , method = RequestMethod.GET)
	public String getCoupon()
	{
		return "HELLO WORLDDD!!!!";
	}
}
