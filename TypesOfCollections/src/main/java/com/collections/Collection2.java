package com.collections;

import java.util.ArrayList;

public class Collection2 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("A");//insert the instance in the collection.
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		
		System.out.println("For loop : ");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		al.remove(0);
		al.remove("C");
		System.out.println("Enhanced for loop : ");
		for(String ar:al)
		{
			System.out.println(ar);
		}
		al.add(1,"Z");
		
		for(String ar:al)
		{
			System.out.println(ar);
		}
		al.set(1, "P");
		System.out.println(al);
		
		ArrayList<String> al1=new ArrayList<>();
		al1.addAll(al);
		
		
		System.out.println(" ");
		System.out.println("**************Methods*************");
		System.out.println("contains       :  "+al.contains("P"));
		System.out.println("equals         :  "+al.equals(al1));//matches 2 collections
		System.out.println("indexof(E)     :  "+al.indexOf("E"));
		System.out.println("indexof(Q)     :  "+al.indexOf("Q"));
		System.out.println("isEmpty        :  "+al.isEmpty());
		System.out.println("lastindexof(E) :  "+al.lastIndexOf("E"));
		System.out.println("lastindexof(N) :  "+al.lastIndexOf("N"));
		System.out.println("subList(1,3)   :  "+al.subList(1, 3));
		System.out.println(al1);
		al.clear();//remove all the elements from the collection
		System.out.println("isEmpty        :  "+al.isEmpty());
	}

}
/*
 * Array :
 * fixed size
 * 
 * Collection:
 * ->dynamically growable
 * ->searching,sorting,insert,manipulate,delete
 * 
 * Iterable(I)->Collection(I)->List(I),Set(I) and Queue(I)
 * List(I)
 * ->ArrayList(C)
 * ->LinkedList(C)
 * ->Vector(C)
 *   ->Stack(C)
 *   
 *->duplicate the element
 *
 * ArrayList :
 * ->insertion order
 * ->dynamic array to store the element
 * ->default size : 10
 * Generics :
 * 1) type safety: specified the type of objects which we are willing to store in the collection.
 * 2) Compile time check : it is checked at the time of compilation so no chance of getting errors.
 * 3) Avoid casting : no need of casting anymore.
 * 3) 
 */


	