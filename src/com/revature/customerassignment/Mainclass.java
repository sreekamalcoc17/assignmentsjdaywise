package com.revature.customerassignment;

public class Mainclass {
	public static void main(String[] args) {
		Customer p1 = new Customer();
		Customer p2 = new Customer("charan",89898989);
		Customer.display("kamal", 989899);
		p1.display("naresh", 909090990, "revature");
		System.out.println(Customer.something);
	}

}
