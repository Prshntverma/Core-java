package com.rays.java.oop.abstraction.interfacee;

public class Businessman extends Person implements Richman,SocialWorker
{
	@Override
	public void earnMoney() {
		System.out.println("earn Moneyyy.......");
	}

	@Override
	public void donation() {
		System.out.println("give donations.....");
	}
	@Override
	public void party() {
		System.out.println("doingg partyyyy........");
			
	}

	@Override
	public void helpToOther() {
		System.out.println("help to other peoples.........");
		
	} 
}


