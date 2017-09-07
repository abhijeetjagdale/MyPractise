package com.coe.exceptions.checked;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilenotFound_Demo {
	public static void main(String[] args) {
		try {

			File f = new File("C:/a_work_repo/settings.xml");
			FileReader read = new FileReader(f);
			BufferedReader br = new BufferedReader(read);
			while (br.readLine() != null)
				System.out.println(br.readLine());
	} catch (Exception e) {
			e.printStackTrace();
		}
		// If we try to compile this program without throws, try-catch we get
		// error message.
	}
}
