package com.inexture.oauth2Demo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/index")
	String index() {
		return "This is my home page";
	}

}
