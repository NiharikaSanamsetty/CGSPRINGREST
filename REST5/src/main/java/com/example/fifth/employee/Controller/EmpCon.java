package com.example.fifth.employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.fifth.employee.Service.EmployeeService;
import com.example.fifth.employee.entity.Employee;

@RestController
public class EmpCon {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employee")
	public List<Employee> getInventories() {
		return this.employeeService.getEmployee();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getOneEmployee(@PathVariable int id ) {
		return this.employeeService.getEmployee(id);
	}
	
	@PostMapping("/employee")
	public List<Employee> addInventory(@RequestBody Employee employee ) {
		return this.employeeService.addOneEmployee(employee);
	}
	
	
	@PutMapping("/employee/{id}")
	public List<Employee> updateOneInventories(@PathVariable int id,@RequestBody Employee employee ) {
		return this.employeeService.updateOneEmployee(id,employee);
	}
	
	
	@DeleteMapping("/employee/{id}")
	public List<Employee> deleteOneEmployee(@PathVariable int id) {
		return this.employeeService.deleteOneInventory(id);
	}
	

}
