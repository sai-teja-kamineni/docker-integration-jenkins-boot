package com.example.github;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@GetMapping("/")
	public String hi() {
		return "hi";
	}

}
