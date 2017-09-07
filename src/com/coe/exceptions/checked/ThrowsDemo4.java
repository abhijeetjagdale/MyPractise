package com.coe.exceptions.checked;

/*B)Program if exception occurs*/
import java.io.*;

class O {
	void method() throws IOException {
		throw new IOException("device error");
	}
}

class ThrowsDemo4 {
	public static void main(String args[]) throws IOException {// declare
																// exception
		O o = new O();
		o.method();

		System.out.println("normal flow...");
	}
}
