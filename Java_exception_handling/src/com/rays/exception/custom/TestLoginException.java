package com.rays.exception.custom;

public class TestLoginException {
	public static void main(String[] args) throws LoginException {// Propagation
		
		String login = "admin12";
		if(login == "admin123") {
			System.out.println("user login successfully");
		}
		else {
			throw new LoginException();
		}
		System.out.println("user enter successfullyy........");
	}

}
