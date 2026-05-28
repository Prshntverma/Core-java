package com.rays.thread.daemon;

public class TestBackgroundDaemon {
	public static void main(String[] args) {
		 BackgroundThread d1 = new BackgroundThread("deamon thread......");
		 d1.setDaemon(true);
		
		 d1.start();
		 for(int i=1;i<100;i++){
			 try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + " main");
		 }
		
	}

}
