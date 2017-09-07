
package com.coe.exceptions.checked;

class Parent2 {
	/*
	 * If the superclass method declares an exception
	 * 
	 * 1) Rule: If the superclass method declares an exception, subclass
	 * overridden method can declare same, ssubclass exception or no exception
	 * but cannot declare parent exception.
	 * 
	 */
	void msg() throws ArithmeticException {
		System.out.println("parent");
	}
}

class ExceptionOverriding3 extends Parent2 {
	void msg() throws NullPointerException {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent2 p = new ExceptionOverriding3();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}
