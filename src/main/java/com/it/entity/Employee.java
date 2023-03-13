package com.it.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Entity
@Table(name = "emp")
public class Employee {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	@Positive(message = "You Have Entered Invalid Id") //id should not be zero or negative
	private int id;
	
	
	@Column(name = "name")
	@NotNull(message = "Name cannot be null")
	@Size(min = 3, max = 15, message = "Name should be between 3 to 15 characters") //Name should be between min 3 and max 15 characters
	private String name;
	
	
	@Column(name = "sal")
	@Positive(message = "Invalid Salary")	//id should not be zero or negative
	@Min(value = 5000, message = "Salary should not be less than 5000")		//min salary should be 5000
	private int sal;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
}