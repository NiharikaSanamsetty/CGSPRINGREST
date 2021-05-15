package com.example.three.SpringRestPincode.Service;

import org.springframework.stereotype.Service;

import com.example.three.SpringRestPincode.Entity.Pincode;

@Service
public interface ServicePin {

	public Pincode getDetails(int pincode);

}
