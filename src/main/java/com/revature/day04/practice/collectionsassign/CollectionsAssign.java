package com.revature.day04.practice.collectionsassign;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionsAssign {
	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("kamal");
		arr1.add("pranetha");
		arr1.add("abhishek");
		HashSet<String> hss1 = new HashSet<String>();
		hss1.add("shivam");
		hss1.add("Jasdhir");
		hss1.add("karan");
		System.out.println("Array list:");
		for(String i:arr1) {
			System.out.println(i);
		}
		System.out.println("\nHash Set:");
		for(String j:hss1) {
			System.out.println(j);
		}
	}
	
	

}
