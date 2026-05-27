package com.rays.thread.runnable;

public class ThreadRunnable implements Runnable {
	
	private String name;
	public ThreadRunnable(String name) {
		this.name =name;	
	}
	@Override
	public void run() {
		for(int i=1;i<9;i++) {
			System.out.println(i+ "="+name);
		}
		
	}
	
	

}
