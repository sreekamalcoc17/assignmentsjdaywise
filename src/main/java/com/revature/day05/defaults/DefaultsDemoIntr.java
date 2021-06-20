package com.revature.day05.defaults;

public interface DefaultsDemoIntr {
	String abc();
	default int xyz() {
		return 0;
	}
	static void a1() {
		System.out.println("this is a static a1");
	}

}
