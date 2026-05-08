package com.rays.java.oop.encapsulation;

public class AutoMobile {

	private String color ;
	private String make;
	private int speed ;
	public final static int NO_0F_GEARS=6;
	
	public String getColor() {
		return this.color;	
	}
	public void setColor(String color) {
		this.color =color;
	}
	public String getMake() {
		return this.make;
	}
	public void setMake(String make) {
		this.make=make;
	}
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public void brake() {
		if(speed==0) {
			System.out.println("Car is already stopped........!");
		}
		else {
			speed = speed-10;
		}	
	}
	
	public void  accelerator() {
		if(speed==200 || speed>400) {
			System.out.println("Speed is so high please used brake....");
		}
		else {
			speed = speed +10;
		}
	}
	
	
	
	
	
}
