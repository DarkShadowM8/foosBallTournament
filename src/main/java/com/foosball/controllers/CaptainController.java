package com.foosball.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaptainController {
	@GetMapping(value = "/check")
	public String check() {
		return "Success";
	}
}
