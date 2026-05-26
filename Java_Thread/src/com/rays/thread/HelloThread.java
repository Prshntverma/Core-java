package com.rays.thread;

public class HelloThread extends Thread{
	 public String name;
	 
	 public HelloThread(String name) {
		 this.name = name;	
	}
	 public void run() {
		 for(int i = 1 ; i<=10;i++) {
			 
			 try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			 System.out.println(i + " = "+name);
		 }
		 
	 }
	 
	 

}
