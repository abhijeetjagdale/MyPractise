package com.coe.exceptions.checked;

public class CustomException1 extends Exception {

	
	/*If you are creating your own Exception that is known as custom exception or user-defined exception.
	 *  Java custom exceptions are used to customize the exception according to user need.
	 *  By the help of custom exception, you can have your own exception and message.
	 *  Let's see a simple example of java custom exception.*/
	
	CustomException1 (String s){  
	  super(s);  
	 }  
	}  