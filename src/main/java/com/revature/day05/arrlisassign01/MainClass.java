package com.revature.day05.arrlisassign01;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++) {
			arr1.add(i);
		}
		System.out.println(arr1);
		
		for(Integer ele : arr1) {
			if(ele%2 == 0) {
				arr2.add(ele);
			}
		}
		System.out.println(arr2);

	}

}
