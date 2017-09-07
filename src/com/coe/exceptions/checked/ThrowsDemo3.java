package com.coe.exceptions.checked;

import java.io.IOException;

class N{	
/*	Case2: You declare the exception

	A)In case you declare the exception, if exception does not occur, the code will be executed fine.
	B)In case you declare the exception if exception occures, an exception will be thrown at runtime because throws does not handle the exception.
	A)Program if exception does not occur*/
	 void method()throws IOException{  
	  System.out.println("device operation performed");  
	 }  
	}  
	public class ThrowsDemo3{  
	   public static void main(String args[])throws IOException{//declare exception  
	     N n=new N();  
	     n.method();  
	  
	    System.out.println("normal flow...");  
	  }  
	}  

