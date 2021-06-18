package com.revature.day04.employee;
import java.util.ArrayList;
public class EmployeeMain {

	public static void main(String[] args) {
		ArrayList<Employee> arr1 = new ArrayList<Employee>();
		Employee e1 = new Employee(101,"kakak",100000);
		arr1.add(e1);
		Employee e2 = new Employee(102,"lalal",100000);
		arr1.add(e2);
		Employee e3 = new Employee(103,"asddd",100000);
		arr1.add(e3);
		Employee e4 = new Employee(104,"kwewe",100000);
		arr1.add(e4);
		Employee e5 = new Employee(105,"popop",100000);
		arr1.add(e5);
		
		for(Employee i: arr1) {
			System.out.println(i);
		}
		
			}

}
