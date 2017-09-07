package scjp;

import java.util.Comparator;

public class ReSortComparator implements Comparator<String> {         // #6    
		 public int compare(String a, String b) {      
			 return b.compareTo(a);                              // #7    
			 }  
		 } 

