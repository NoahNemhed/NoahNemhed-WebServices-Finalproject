package com.example.FinalWebServices.Calculator;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
	
	private CalculatorService cs = new CalculatorService();
	
	//Starting page.
	@RequestMapping(
			value = "/", 
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String home() {
		String text = "{ \"Welcome message\":\"Welcome to my calculator!\"}";
		
		return text;
		
	}
	
	//Add 2 values
	@RequestMapping(value ="/add", produces = MediaType.APPLICATION_JSON_VALUE)
	public String add(String x, String y) {
		try {
			String pattern = "{\"Result\":\"%s\"}";
			return String.format(pattern, cs.add(x,y));
		}catch(NumberFormatException e) {
			return "{ \"Invalidmsg\":\"Invalid input.\"}";
		}
		
		
	}
	//Multiply 2 values
	@RequestMapping(value = "/multiply", produces = MediaType.APPLICATION_JSON_VALUE)
	public String multiply(String x, String y) {
		try {
			String pattern = "{\"Result\":\"%s\"}";
			return String.format(pattern, cs.multiply(x,y));
		}catch(NumberFormatException e) {
			return "{ \"Invalidmsg\":\"Invalid input.\"}";
		}
		
	}
	//Subtract 2 values
	@RequestMapping(value = "/subtract", produces = MediaType.APPLICATION_JSON_VALUE)
	public String subtract(String x, String y) {
		try {
			String pattern = "{\"Result\":\"%s\"}";
			return String.format(pattern, cs.subtract(x,y));
		}catch(NumberFormatException e) {
			return "{ \"Invalidmsg\":\"Invalid input.\"}";
		}
		
	}
		

}
