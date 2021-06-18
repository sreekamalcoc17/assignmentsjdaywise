package com.revature.day04;
import java.util.Scanner;
public class Friends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	  String[] names= new String[5];
	  for(int i=0;i<=4;i++) {
		  String name= sc.nextLine();
		  names[i]= name;
	  }
	for(String ele:names) {
		System.out.println(ele+" ");
	}
	}
}
