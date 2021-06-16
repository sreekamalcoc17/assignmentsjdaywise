package com.revature.day03assignments;

public class SquareMain {
	
	public static float[] square(int a,int b,int c,int d) {
		float[] arr1 = new float[4];
		arr1[0] = a*a;
		arr1[1] = b*b;
		arr1[2] = c*c;
		arr1[3] = d*d;
		return arr1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] res = new float[4];
		res = square(1,2,3,4);
		for(float i :res)
		{
			System.out.println(i);
		}
	}

}
