package com.revature.day03assignments;

public class RandomNumber01 {
	public static int randomNumber() {
		int minNum = 1;
		int maxNum = 50;;
		double d = Math.random()*(maxNum-minNum);
		return (int)d;
	}

	public static void main(String[] args) {
		
		System.out.println(randomNumber());

	}

}
