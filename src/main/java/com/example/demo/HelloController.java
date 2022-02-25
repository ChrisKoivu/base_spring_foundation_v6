package com.example.demo;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {

	@GetMapping("/")
	public ModelAndView index() {
		System.out.println("Index controller");
		 HashMap contentParams  = new HashMap<String, String>();
		 contentParams.put("title", "Welcome to your new Website!");
		 contentParams.put("footer","footer area");
		 contentParams.put("cardTitle", "this is a card");
		 contentParams.put("cardHeading", "this is the card heading");
		 contentParams.put("template", "card");
		 contentParams.put("cardContent", "this is the content");

		 return new ModelAndView("index", contentParams);		
	}

}