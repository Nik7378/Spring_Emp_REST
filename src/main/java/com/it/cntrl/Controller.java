package com.it.cntrl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.it.entity.Employee;
import com.it.exception.InvalidNameException;
import com.it.service.EmpService;

@RestController
@CrossOrigin(origins="http://localhost:8080")
public class Controller {

	@Autowired //searches for the object of EmpService and inject into service variable
	private EmpService service;
	
	@PostMapping("/employee/add")
	public String addEmp(@RequestBody @Valid Employee e) {
		if(e.getName().contains(" ")) {
			throw new InvalidNameException(); //if name contains any spaace then it will throw InvalidNameException
		}
		else {
			service.add(e);
			return "Data Added";
		}
	}
	

	@GetMapping("/employee/id/{id}")
	public Employee getEmpById(@PathVariable int id){
		Employee e = service.getById(id);
		return e;
	}
	
	@GetMapping("/employee/name/{name}")
	public List<Employee> getEmpByName(@PathVariable String name) {
		return service.getAllByName(name);
		 
	}
	
	@GetMapping("/employee/all")
	public List<Employee> allEmployee(){
		return service.findAllRecords();
	}
	
	@PutMapping("/employee/update")
	public String updateEmp(@RequestBody Employee e) {
		service.update(e);
		return "Data Updated";
	}
	
	@DeleteMapping("/employee/delete/id/{id}")
	public String deleteEmp(@PathVariable("id") int id) {
		service.deleteRecordById(id);
		return "Data Deleted";
	}
	
	@DeleteMapping("/employee/deleteall")
	public String deleteAllEmp() {
		service.deleteAllRecords();
		return "All Data Deleted";
	}
}
