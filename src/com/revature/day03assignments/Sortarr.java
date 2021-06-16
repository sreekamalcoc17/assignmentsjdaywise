package com.revature.day03assignments;
import java.util.Arrays;

public class Sortarr {
	public static String findFirstWord(String str1, String str2) {
		String[] arr1 = {str1,str2};
		Arrays.sort(arr1);
		return arr1[0];

	}
	public static void main(String[] args) {
		String res = findFirstWord("praneetha","bapatla");
		System.out.println(res);
		
	}

}
