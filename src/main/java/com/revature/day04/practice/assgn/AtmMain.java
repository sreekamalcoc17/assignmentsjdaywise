package com.revature.day04.practice.assgn;

public class AtmMain {
	static void withdrawl(double amt) throws WithdrawlError{
		if(amt<100) {
			throw new WithdrawlError("withdrawl not possible");
		}
		else {
			System.out.println("withdrawl sucess"); 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("try block starting");
		try{
			withdrawl(250);
			System.out.println("try block ending!");
			//System.exit(0);
		}
		catch(Exception e){
			System.out.println("try block executed, redirected to catch block!!");
			System.out.println(e);
			System.out.println("catch block executed!");
			
		}finally {
			System.out.println("transaction complete");
		}
	}

}
