package com.it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.it.dao.EmployeeRepo;
import com.it.entity.Employee;

@Component
public class EmpService {
	
	@Autowired
	private EmployeeRepo repo;
	
	public Employee getById(int id) {
		Employee e= repo.findById(id).get();
		return e;
	}
	
	public List<Employee> getAllByName(String name) {
		List<Employee> list = repo.findByName(name);
		return list;
	}
	
	public List<Employee> findAllRecords(){
		List<Employee> list = repo.findAll();
		return list;
	}
	
	public void add(Employee e) {
		repo.save(e);
	}

	public void update(Employee e) {
		repo.save(e);
	}

	public void deleteRecordById(int id) {
		repo.deleteById(id);
	}

	public void deleteAllRecords() {
		repo.deleteAll();
	}

	
}
