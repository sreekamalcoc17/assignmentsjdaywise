package com.revature.day05.threads01;

class FivesTable extends Thread{
    Table t;
    FivesTable(Table t){
    	this.t=t;
    }
    
    public void run(){
    	t.printTable(5);
    }
     
    }