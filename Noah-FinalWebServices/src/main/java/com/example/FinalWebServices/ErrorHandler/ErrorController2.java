package com.example.FinalWebServices.ErrorHandler;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController2 implements ErrorController{
	
	//Error page.
	@RequestMapping(value = "/error", produces = MediaType.TEXT_HTML_VALUE)
	public String handleError(HttpServletResponse response) {

	        if(response.getStatus() != HttpStatus.OK.value()) {
	    		String result = "";
	    		result += "<html><head><title>Error Page</title></head>";
	    		result += "<body>";
result += "<h4>\"Detta API har 4 olika funktioner "
		+ "/calculator, /game, /img, /CSV." + "<br>"
		+ "Exempel -> /calculator/add?x=2&y=3 returnerar '5' i JSON format." + "<br>"
		+ "Exempel -> /calculator/multiply?x=2&y=3 returnerar '6' i JSON format." + "<br>"
		+ "Exempel -> /calculator/subtract?x=4&y=3 returnerar '1' i JSON format." + "<br>"
		+ "-----------------------------------------------------------------------'" + "<br>"
		+ "Exempel -> /game/choice?choice=rock | kommer att spela draget 'sten' denna används med en 'POST method'" + "<br>"
		+ "Exempel -> /game/result kommer att visa resultatet från de spelade matcherna i JSON format. Denna använder en 'GET method'" + "<br>"
		+ "-----------------------------------------------------------------------" + "<br>"
		+ "Exempel -> /img kommer att generera en 50% chans att visa en bild på Donald Trump och 50% chans för att visa en bild på Obama. Denna använder även en 'GET method'" + "<br>"
		+ "-----------------------------------------------------------------------" + "<br>"
		+ "Exempel -> /CSV/showCSV kommer att returnerna texten från en CSV fil till JSON format via 'GET method'"
		+ "</h4>";

	    		result += "</body></html>";
	    		return result;
	        }

	    
	    return "Something went wrong!";
	
	}
	
}
