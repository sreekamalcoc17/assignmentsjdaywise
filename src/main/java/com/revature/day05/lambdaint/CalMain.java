package com.revature.day05.lambdaint;

public class CalMain {
	public static int res(int x,int y,String op) {
		int result = 0;
		if(op == "+") {
			return result = x+y;
		}
		else if(op == "-") {
			return result = x-y;
		}
		else if(op == "*") {
			return result = x*y;
		}
		else if(op == "/") {
			return result = x/y;
		}
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambIntr i1 = (x,y,op)->{return res(x,y,op);};
		System.out.println(i1.calc(2, 3, "+"));
		

	}

}
