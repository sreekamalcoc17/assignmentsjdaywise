package com.revature.day03;

public class ContractEmployee extends Employee{
private int hours;

public ContractEmployee(int id, String name, String dept, int hours) {
	super(id, name, dept);
	this.hours = hours;
}

public int getHours() {
	return hours;
}

public void setHours(int hours) {
	this.hours = hours;
}

@Override
public String toString() {
	return super.toString()+"ContractEmployee [hours=" + hours + "]";
}

@Override
public String getAllowances() {
	// TODO Auto-generated method stub
	return "Health";
}

}
