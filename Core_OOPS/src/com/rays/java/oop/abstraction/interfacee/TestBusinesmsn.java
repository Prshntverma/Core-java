package com.rays.java.oop.abstraction.interfacee;

public class TestBusinesmsn {

	public static void main(String[] args) {
		Richman r = new Businessman();
		r.earnMoney();
		r.donation();
		r.party();
		
		SocialWorker s = new Businessman();
		s.helpToOther();
		
	}
}
