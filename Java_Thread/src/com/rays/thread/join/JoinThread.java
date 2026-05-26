package com.rays.thread.join;

public class JoinThread extends Thread{
	 
	String name = null;
	public JoinThread(String name) {
		this.name = name;
	}
	@Override
	public void run() {	
			for(int i=1 ;i<5;i++) {
				
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i+"="+name);
			}
		}
		
	}	

	
