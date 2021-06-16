package com.revature.day03;

public class SalariedEmployee extends Employee implements Taxes{
	private double salary;

	public SalariedEmployee(int id, String name, String dept, double salary) {
		super(id, name, dept);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString()+"SalariedEmployee [salary=" + salary + "]";
	}

	@Override
	public String getAllowances() {
		// TODO Auto-generated method stub
		return "Travel Food Health";
	}

	@Override
	public String payTaxes() {
		// TODO Auto-generated method stub
		return "taxes are implemented for salaried";
	}
	

	
		
	
}
