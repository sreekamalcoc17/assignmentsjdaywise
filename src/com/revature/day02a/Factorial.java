package com.revature.day02a;

public class Factorial {
	private int res = 1;
	int factorial(int i) {
		for(int j=1;j<=i;j++) {
			res = res*j;	
		}
		return res;
	}
	public static void main(String[] args) {
		Factorial ab = new Factorial();
		System.out.println(ab.factorial(5));
	}

}
