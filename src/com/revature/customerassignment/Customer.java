package com.revature.customerassignment;

public class Customer {
	private String fullName;
	private long pNo;
	private String client;
	final String WELCOME = "revature" ;
	static String something = "this is staic string.";
	
	public Customer() {
		
	}
	public Customer(String cusName,long phno) {
		fullName = cusName;
		pNo = phno;
		System.out.println("welcome to "+ WELCOME);
	}
	public static void display(String name, long pno) {
		/*fullName = name;
		pNo = pno;*/
		System.out.println("your name: "+name+" "+"pNo: "+pno);
	}
	public void display(String name, long pno,String comp) {
		fullName = name;
		pNo = pno;
		client = comp;
		System.out.println("your name: "+name+" "+"pNo: "+pno+" "+"company: "+comp);
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public long getpNo() {
		return pNo;
	}
	public void setpNo(long pNo) {
		this.pNo = pNo;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
}
