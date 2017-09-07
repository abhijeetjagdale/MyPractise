package scjp;

import java.util.*; 
public class TestBadLegacy {    
	public static void main(String[] args) {        
		List<Integer> myList = new ArrayList<Integer>();        
		myList.add(4);       
		myList.add(6);    
		Inserter in  = new Inserter();      
		in.insert(myList);  // pass List<Integer> to legacy code      
		} 
	} 
class Inserter {    
		// method with a non-generic List argument    
		void insert(List list) {       
			list.add(new String("abc")); // adds to the incoming list   
			System.out.println(list);
			} 
		
		}
	
