package com.it.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.it.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
	
	List<Employee> findAll();

	List<Employee> findByName(String name);
}
