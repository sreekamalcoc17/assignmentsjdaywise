package com.revature.day03;

public class Managermain {
	public static void main(String[] args) {
		ContractEmployee e1 = new ContractEmployee(101,"kamal","IT",20);
		SalariedEmployee e2 = new SalariedEmployee(102,"wqe","CS",500000);
		System.out.println(e1);
		System.out.println(e1.getAllowances());
		System.out.println(e2);
		System.out.println(e2.getAllowances());
		System.out.println(e2.payTaxes());
	}
	
	
}
