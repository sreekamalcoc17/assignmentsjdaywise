package com.revature.day02a;
import java.util.StringTokenizer;
public class Mainclass {
	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("String1");
		StringBuilder str2 = new StringBuilder("String2");
		String str4 = "lamal kank kamal jamal kijki juju huhu kaka mama jaja iaia tata tuyu";
		StringTokenizer x = new StringTokenizer(str4, " ");
		String[] arr1 = new String[x.countTokens()];
		int i = 0;
		int ab = x.countTokens();
		str1.append("kamal hello");
		str2.setCharAt(4,'h');
		String str3 = str1.substring(6,9);
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str3);
		System.out.println(x.countTokens());
		while(x.hasMoreTokens() && i<ab*ab) {
			arr1[i]=x.nextToken();
			i++;
		}
		for(String p : arr1) {
			System.out.println(p);
		}
 	}

}
