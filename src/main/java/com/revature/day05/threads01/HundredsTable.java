package com.revature.day05.threads01;

class HundredsTable extends Thread{
    Table t;
    HundredsTable(Table t){
    	this.t=t;
    }
    
    public void run(){
    	t.printTable(100);
    }
    }