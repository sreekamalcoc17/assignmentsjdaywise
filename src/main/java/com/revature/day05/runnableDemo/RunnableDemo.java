package com.revature.day05.runnableDemo;

public class RunnableDemo implements Runnable {
	private Thread t;
	private String threadName;
	RunnableDemo(String name){
		threadName = name;
		System.out.println("Creating " +  threadName );
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		         System.out.println("Running " +  threadName );
		          try {
		             for(int i = 4; i > 0; i--) {
		                System.out.println("Thread: " + threadName + ", " + i);
		                // Let the thread sleep for a while.
		                Thread.sleep(50);
		             }
		          } catch (InterruptedException e) {
		             System.out.println("Thread " +  threadName + " interrupted.");
		          }
		          System.out.println("Thread " +  threadName + " exiting.");
		       }
		      
		       
		    
		 
	}
	


