package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {

	@GetMapping(value = "/getMyName")
	public String getMyName() {
		return "My Name is Godwin";

	}

}
