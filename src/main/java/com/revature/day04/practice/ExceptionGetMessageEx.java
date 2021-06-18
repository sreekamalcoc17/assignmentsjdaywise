package com.revature.day04.practice;

public class ExceptionGetMessageEx {
	public static void division() {
		try {
			int a = 3;
			int b =0;
			double res = a/b;
			System.out.println(res);
		}catch(ArithmeticException e) {
			System.out.println(e.getStackTrace());
			System.out.println(e.getCause());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
			
		}
		
	}


	public static void main(String[] args) {
		division();
	}

}
