package scjp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.org.apache.xerces.internal.impl.dv.DVFactoryException;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Runmain {
	List dvdinfolist = new ArrayList<Dvdinfo>();
	
	 public void populateList() throws IOException{
		 String line;
		 File f = new File("C:\\Users\\jagdale\\Desktop\\test\\dvdinfo.txt");
		 FileReader fr = new FileReader(f);
		 BufferedReader br = new BufferedReader(fr);
		 while((line=br.readLine())!=null)
		 {
			 String w[] =  line.split("/");
			 Dvdinfo d = new Dvdinfo(w[0], w[1], w[2]);
			 dvdinfolist.add(d);
		 }
		 /*for (Object object : dvdinfolist) {
			 String w[] = ((String) object).split("/");
			 new Dvdinfo();
			
		 System.out.println(dvdinfolist);
		 }	*/ 
		 System.out.println("===================Unsorted List=======================");
		 for (Object o : dvdinfolist) {
			 System.out.println((Dvdinfo)o);
		}
		 System.out.println("===================Sorted List=======================");
		 java.util.Collections.sort(dvdinfolist);
		 
		 for (Object o : dvdinfolist) {
			 System.out.println((Dvdinfo)o);
		}
		 
	 }
	 
	 public static void main(String[] args) {
		Runmain r = new Runmain();
		String a[] = {"a","d","c","r","g"};
		//Arrays.sort(a);
		for(int i=0; i<a.length; i++)
		System.out.println(a[i]);
		
		try {
			r.populateList();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GenreSort g = new GenreSort();
		java.util.Collections.sort(r.dvdinfolist,g);
		
		System.out.println("===================Sorted List by genre=======================");
		 for (Object o : r.dvdinfolist) {
			 System.out.println((Dvdinfo)o);
		}
	}
	 

}
