package com.coe.exceptions.checked;

public class CustomException2 {
	static void validate(int age) throws CustomException1 {
		if (age < 18)
			throw new CustomException1("Nit valid to vote");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {
		try {
			validate(13);
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		}

		System.out.println("rest of the code...");
	}
}
