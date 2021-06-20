package com.revature.day05.threads01;

public class Test{
    public static void main(String args[]){
    	Table obj = new Table();//only one object
    	FivesTable t1=new FivesTable(obj);
    	HundredsTable t2=new HundredsTable(obj);
    	t1.start();
    	t2.start();
    }
    }