import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.org.apache.xalan.internal.xsltc.cmdline.Compile;

public class ReadLog {
	String line;
	List ID = new ArrayList<String>();

	public void read() throws IOException {
		File f = new File("C:\\Users\\jagdale\\Desktop\\test\\TestLog.log");
		FileReader in = new FileReader(f);
		BufferedReader br = new BufferedReader(in);
		while ((line = br.readLine()) != null) {
			if (line.contains("ThreadID")) {
				/*
				 * Pattern p = Pattern.compile("([0-9]+)|(\\w+)$"); Matcher m =
				 * p.matcher(line); while (m.find()) { String tid = m.group(1);
				 * String st_ed = m.group(2); System.out.println(tid+
				 * " "+st_ed);
				 */
				String s[] = line.split("-");
				if (s[2].contains("Start")) {
					ID.add(s[1]);
				}
				if (s[2].contains("End") && ID.contains(s[1])) {
					ID.remove(s[1]);
				}
				/*
				 * for(int i=0; i<s.length;i++) { System.out.println(s[i]);
				 * 
				 * }
				 */
			}
		}
		System.out.println("The Thread IDs doesnt END :-");
		System.out.println(ID);
	}

	

	public static void main(String[] args) throws IOException {
		ReadLog r = new ReadLog();
		r.read();
	}

}
