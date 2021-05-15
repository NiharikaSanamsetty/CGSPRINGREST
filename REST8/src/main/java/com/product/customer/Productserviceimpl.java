package com.product.customer;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class Productserviceimpl implements Productservice {

	@Autowired
	Productdao dao;

	
	@Override
	public void createEmployee(List<Product> emp) {
		dao.saveAll(emp);
	}

	@Override
	public Collection<Product> getAllEmployees() {
		return dao.findAll();
	}

	@Override
	public Optional<Product> findEmployeeById(int id) {
		return dao.findById(id);
	}

	
	@Override
	public void deleteEmployeeById(int id) {
		dao.deleteById(id);
	}

	@Override
	public void updateEmployee(Product emp) {
		dao.save(emp);
	}

	
	@Override
	public void deleteAllEmployees() {
		dao.deleteAll();
	}
}