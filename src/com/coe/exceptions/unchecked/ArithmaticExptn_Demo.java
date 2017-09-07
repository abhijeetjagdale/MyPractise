package com.coe.exceptions.unchecked;

import java.awt.image.SampleModel;

public class ArithmaticExptn_Demo {
	
	int result; 
	final int a=20;
	int b = 0;
	String s;
	
	public void sampleMethod(int a){
	//try{
		this.a = a;
		int result = a/b;
		
	//}
	/*catch (Exception e) {
		System.out.println("Please do not divede by zero");
	}*/
	//return result;
		// TODO: handle exception
	}
	
	public String method(String s) {
		
		s = s.substring(1, 3);
		return s;
	}
	
	public static void main(String[] args) {
		ArithmaticExptn_Demo arithmaticExptn_Demo = new ArithmaticExptn_Demo();
		//arithmaticExptn_Demo = null;
		arithmaticExptn_Demo.sampleMethod(10);
		//System.out.println(result);
		System.out.println("Thanks");
		/*String a = null;
		System.out.println(arithmaticExptn_Demo.method(a));
		*/
	}

}
