package com.revature.day02;

public class Student {
	int rollNo;
	String name;
	
	Student(int rno, String name1) {
		rollNo = rno;
		name = name1;

	}
	
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	void display() {
		System.out.println("roll no: "+rollNo+" "+"name: "+name);
		
	}
}
