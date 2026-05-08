package com.rays.exception.custom;

public class LoginException extends Exception{ // custom checked exception
  public LoginException() {
	   super("login exception & user not found !!");
  }
}
