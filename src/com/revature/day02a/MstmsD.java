package com.revature.day02a;
import java.util.Scanner;
public class MstmsD {

	public static void main(String[] args) {
		Scanner inp1 = new Scanner(System.in);
		boolean run = true;
		while(run) {
			char ch = inp1.next().charAt(0);
			switch(ch) {
			case '1':
				System.out.println("Moving Right");
				break;
			
			case '2':
				System.out.println("Moving left");
				break;
				
			case '3':
				System.out.println("Moving up");
				break;
			case '4':
				System.out.println("Moving down");
				break;
			case 'q':
				run = false;
				break;
			default:
				System.out.println("Try again. Acceptable input: [1 - Move right, 2 - Move Left, 3 - Move Up, 4 - Move Down, q - exit program]");
			
			
			
		}
		}

	}

}
