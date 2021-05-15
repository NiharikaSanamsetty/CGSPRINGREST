package com.example.two.SpringRestHelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HWC {
	@Autowired
	ServiceH a;
	@GetMapping("hell")
	public String sayHello() {
		return a.hello();
	}
	
}
