package com.example.FinalWebServices.ReadImageFile;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {
	
	@RequestMapping(value = "/img", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public void showImg(HttpServletResponse response) throws IOException
	{
		String img;
		//Generates 50% chance for img to display Obama, and 50 for Trump.
		if(Math.random() < 0.5) {
			img = "obama";
		}else {
			img = "trump";
		}
		
		//Sets the destination to img file.
		var imgFile = new ClassPathResource("img/" + img + ".jpg");
		response.setContentType(MediaType.IMAGE_JPEG_VALUE);
		//Displays img.
		StreamUtils.copy(imgFile.getInputStream(), response.getOutputStream());
		
		
	}
}
