package com.example.two.SpringRestLogin.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.two.SpringRestLogin.entity.User;

@Service
public abstract class ServiceUserI implements UserService {

	List<User> users;

	public ServiceUserI() {
		users = new ArrayList<>();
		users.add(new User("Naman", "Password123"));
		users.add(new User("Nikita", "Password1234"));
		users.add(new User("Niharika", "Password0123"));
		users.add(new User("Nairobi", "Password1023"));
		users.add(new User("Tokyo", "Password1203"));
		users.add(new User("Professor", "Password1230"));
		users.add(new User("Shinchan", "0Password123"));
		users.add(new User("Kavita", "Passw0rd123"));
	}

	@Override
	public String check(User u1) {
		for (User u : users)
			{
		  if(u.getUserName().matches(u1.getUserName()))
		  {
			  if(u.getPassword().matches(u1.getPassword())) 
					return  "Valid User"; 
		  }
			}
		return "Invalid User";
	}

}
