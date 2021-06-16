package com.revature.day02a;
import java.util.Scanner;
import java.lang.*;
public class MstmsC {
	public static void main(String[] args) {
		int count=0;
		Scanner scan = new Scanner(System.in);
		String inp1 = scan.nextLine();
		inp1 = inp1.toLowerCase();
		for(int i=0; i<inp1.length();i++) {
			if(inp1.charAt(i)=='a' 
					|| inp1.charAt(i)=='e' 
					|| inp1.charAt(i)=='i'
					|| inp1.charAt(i)=='o'
					|| inp1.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println(count);
	}

}
