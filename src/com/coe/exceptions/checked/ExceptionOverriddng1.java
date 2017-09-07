package com.coe.exceptions.checked;

import java.io.IOException;

public class ExceptionOverriddng1 extends ExceptionWithOverriding {
	/*
	 * If the superclass method does not declare an exception 1) Rule: If the
	 * superclass method does not declare an exception, subclass overridden
	 * method cannot declare the checked exception.
	 */

	void msg() throws IOException {
		System.out.println("TestExceptionChild");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild();
		p.msg();
	}
}