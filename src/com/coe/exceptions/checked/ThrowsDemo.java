
package com.coe.exceptions.checked;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {

	void abhijeet() throws IOException, FileNotFoundException {
		File f = new File("C:/a_work_repo/settings.xml1");
		FileReader read = new FileReader(f);
		BufferedReader br = new BufferedReader(read);
		while (br.readLine() != null)
			System.out.println(br.readLine());
		//throw new IOException("device error");// checked exception
	}

	void sam() throws IOException, FileNotFoundException{
		abhijeet();
	}

	void pooja(){
	try {
			sam();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		ThrowsDemo obj = new ThrowsDemo();
		obj.pooja();
		System.out.println("normal flow...");
	}
}


/*Which exception should be declared

Ans) checked exception only, because:

unchecked Exception: under your control so correct your code.
error: beyond your control e.g. you are unable to do anything if there occurs VirtualMachineError or StackOverflowError.
Advantage of Java throws keyword

Now Checked Exception can be propagated (forwarded in call stack).

It provides information to the caller of the method about the exception.*/