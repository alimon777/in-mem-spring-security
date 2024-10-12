package com.ust.secure.resource;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class EmployeeResource {
	
	@GetMapping("/")
	public String greet() {
		return "Working";
	}
	@GetMapping("/admin")
	public String greetAdmin() {
		return "AdminWorking";
	}
	@GetMapping("/user")
	public String greetUser() {
		return "User@Work";
	}
	
}
