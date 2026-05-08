package com.rays.exception.custom;

public class InSufficientFundException extends RuntimeException {// custom unchecked exception
   public InSufficientFundException() {
	   
	   super("insufficient Fund transfer");
   }
	
}
