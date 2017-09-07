package com.coe.exceptions.checked;

import java.io.IOException;

class M {
	
	/*Rule: If you are calling a method that declares an exception, you must either caught or declare the exception.

	There are two cases:
	Case1:You caught the exception i.e. handle the exception using try/catch.
	Case2:You declare the exception i.e. specifying throws with the method.
	Case1: You handle the exception

	In case you handle the exception, the code will be executed fine whether exception occurs during the program or not.*/	
	
	 void method()throws IOException{  
	  throw new IOException("device error");  
	 }  
	}  
	public class ThrowsDemo2 {  
	   public static void main(String args[]){  
	    try{  
	     M m=new M();  
	     m.method();  
	    }catch(Exception e){System.out.println("exception handled");}     
	  
	    System.out.println("normal flow...");  
	  }  
	}  

