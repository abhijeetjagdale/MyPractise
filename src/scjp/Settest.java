package scjp;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Settest {
	public static void main(String[] args) {
		boolean b[] =  new boolean[5];
		Set s = new TreeSet();
		TreeMap m = new TreeMap();
		SortedMap m1 = m.subMap(new Integer(40), new Integer(42));
		b[0] = s.add(new Integer(44));
		b[1] = s.add(new Integer(43));
		b[2] = s.add(new Integer(42));
		b[3] = s.add(new Integer(41));
		b[4] = s.add(new Integer(40));
		for(int i =0; i<b.length; i++)
			System.out.println(b[i]);
		for(Object o :s)
			System.out.println(o);
	}
	

}
