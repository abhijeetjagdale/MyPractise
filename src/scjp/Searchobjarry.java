package scjp;

import java.util.*; 
class SearchObjArray {  
	public static void main(String [] args) {    
	String [] sa = {"one", "two", "three", "four"};
    Arrays.sort(sa);                                      // #1    
    for(String s : sa)      
    System.out.print(s + " ");     
    System.out.println("\none = "   + Arrays.binarySearch(sa,"one"));  // #2
    System.out.println("now reverse sort");    
    ReSortComparator rs = new ReSortComparator();         // #3    
    Arrays.sort(sa,rs);                                  
    for(String s : sa)      
    System.out.print(s + " ");     
    System.out.println("\none = " + Arrays.binarySearch(sa,"one"));  // #4    
    System.out.println("one = " + Arrays.binarySearch(sa,"one",rs));  // #5  
    
		
		List l = new ArrayList();
		for(int i=0; i<=3; i++)
			l.add(i);
		System.out.println(l);
		Integer[] a =  new Integer[10];
		Object o[] = l.toArray();
		Iterator i = l.iterator();
		while(i.hasNext())
		System.out.println(i.next());
		
		a=(Integer[]) l.toArray(a);
		for(Integer b : a)
		System.out.println(b);
   }	 
}
	 