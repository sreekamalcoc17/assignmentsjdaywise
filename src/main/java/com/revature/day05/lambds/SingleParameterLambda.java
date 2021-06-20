package com.revature.day05.lambds;

public class SingleParameterLambda {
	public static void main(String[] args) {
		SaySomething s3 = (firstName,lastName,middleName) ->{return "hello, "+firstName+lastName+middleName;}; 
		System.out.println(s3.sayFullName("sree ","kamal ","ramisetty"));
	}
	

}
/*	public static void main(String[] args) {
		SaySomething s1 = (name) ->{ return "hello "+ name; };
		System.out.println(s1.sayName("kams"));
		
		SaySomething s2= name ->"Hello, "+name; ;
        System.out.println(s2.sayName("Paul"));
	}

}*/
