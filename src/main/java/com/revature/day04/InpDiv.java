package com.revature.day04;
import java.util.Scanner;
public class InpDiv {
	public static void divideAndStore() {
		try {
			int num=10;
			int res =num/2;
			System.out.println(res);
			int[] arr1 = res;
					
		}
		catch(ArithmeticException e) {
			e.printStackTrace();			
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		divideAndStore();
		
		
		
		
		
		/*Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		int b = inp.nextInt();
		System.out.println((float)a/b);*/

	}

}
