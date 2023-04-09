package com.hibernate.curd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	private String eName;
	private double eSal;

	
	public Employee() {
		super();

	}

	public Employee(String eName, double eSal) {
		super();

		this.eName = eName;
		this.eSal = eSal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double geteSal() {
		return eSal;
	}

	public void seteSal(double eSal) {
		this.eSal = eSal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", eName=" + eName + ", eSal=" + eSal + "]";
	}

}
