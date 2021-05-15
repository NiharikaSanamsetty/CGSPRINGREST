package com.example.three.SpringRestPincode.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.three.SpringRestPincode.Entity.Pin;
import com.example.three.SpringRestPincode.Entity.Pincode;
import com.example.three.SpringRestPincode.Service.ServicePin;

@RestController
public class ControllerPin {
	
	@Autowired
	ServicePin s;

	@GetMapping("/find/{pincode}")
	public Pincode get(@PathVariable int pincode) {
		System.out.println(pincode);
		return s.getDetails(pincode);	
	}
}
