package com.coe.exceptions.checked;

class Parent1 {
	/*
	 * Rule: If the superclass method does not declare an exception, subclass
	 * overridden method cannot declare the checked exception but can declare
	 * unchecked exception.
	 */
	void msg() {
		System.out.println("parent");
	}
}

class ExceptionOverriding2 extends Parent1 {
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent1 p = new ExceptionOverriding2();
		//ExceptionOverriding2 e = (ExceptionOverriding2)new Parent1();
		//e.msg();
		p.msg();
	}
}
