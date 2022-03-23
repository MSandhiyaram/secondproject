package com.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Collection5LinkedList 
{

	public static void main(String[] args) 
	{
		//LinkedList :
		//	1 23 78 4 54 65 
			//numerous shifting is performed because of insertion or deletion of an element
			//results in high overhead cost for the system.
			
			//manipulation in linkedlist is fast as no shifting is performed.
			//arraylist uses dynamic array
			//linkedlist creates a node to hold the data as well as the address of next 
			//and previous nodes
			
			LinkedList<String> ll=new LinkedList<>();
			ll.add("A");
			ll.add("B");
			ll.add("C");
			ll.add("A");
			ll.add("D");
			ll.add("D");
			ll.add("E");
			ll.add("F");
			
			System.out.println(ll);
			
			System.out.println("size()       :"+ll.size());
			System.out.println("contains(A)  :"+ll.contains("A"));
			System.out.println("element()    :"+ll.element());//returns the first/topmost element
			System.out.println("get()        :"+ll.get(4));
			System.out.println("getFirst()   :"+ll.getFirst());
			System.out.println("getLast()    :"+ll.getLast());
			System.out.println("indexOf(E)   :"+ll.indexOf("E"));
			System.out.println("isEmpty()    :"+ll.isEmpty());
			System.out.println("lastIndexOf():"+ll.lastIndexOf("A"));
			System.out.println("peek()       :"+ll.peek());//get(0)
			System.out.println("peekFirst()  :"+ll.peekFirst());//get(0)
			System.out.println("peekLast()   :"+ll.peekLast());//get(ll.size()-1)
			System.out.println("poll()       :"+ll.poll());//removes the first element
			System.out.println("pollFirst()  :"+ll.pollFirst());//removes the first element
			System.out.println("pollLast()   :"+ll.pollLast());//removes the last element
			System.out.println("remove()     :"+ll.remove(3));
			System.out.println(" ");
			ll.add(0, "Value");
			ll.addFirst("Collection");
			ll.addLast("LastElement");
			System.out.println(ll);
			//sort the collection
			System.out.println(" ");
			System.out.println("sorted collection");
			Collections.sort(ll);//Collections : class sort:static method

			System.out.println(ll);
			System.out.println(" ");
			System.out.println("reverse ");
			Collections.reverse(ll);
			System.out.println(ll);
			
			//descending
			//sort
			//reverse
		

	}

}
