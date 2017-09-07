package scjp;

import java.util.*;

public class LinkedListDemo {

   public static void main(String[] args) {

   // create a LinkedList
   LinkedList list = new LinkedList();

   // add some elements
   list.add("Hello");
   list.add(2);
   list.add("Chocolate");
   list.add("10");

   // print the list
   System.out.println("LinkedList:" + list);

   // set Iterator at specified index
   Iterator x = list.listIterator();

   // print list with the iterator
   while (x.hasNext()) {
	   list.add(1,"abc");
   System.out.println(x.next());
   }
   }
}