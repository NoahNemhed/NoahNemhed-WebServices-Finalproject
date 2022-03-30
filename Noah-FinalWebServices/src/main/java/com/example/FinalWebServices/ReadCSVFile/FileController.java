package com.example.FinalWebServices.ReadCSVFile;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/CSV")
public class FileController {
	
	@RequestMapping(
			value = "/", 
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String welcome() {
		String text = "{ \"Welcome message\":\"Welcome to my CSV reader!\"}";
		
		return text;
	}
	//Shows CSV file as JSON
	@RequestMapping(
			value = "/showCSV",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String showCSV() throws IOException {
		FileReader myReader = new FileReader();
		
		String text = myReader.readFile("sample.csv");
		return text;
	}
}
