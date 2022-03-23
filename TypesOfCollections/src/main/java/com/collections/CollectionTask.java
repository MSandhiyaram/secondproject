package com.collections;

import java.util.ArrayList;

public class CollectionTask {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("Fetch the element:  ");
		for(int i=0;i<al.size();i++)
		{
			
			System.out.println(al.get(i));
		}
		System.out.println(" ");
		//remove
		System.out.println("Remove the elements:");
		al.remove(1);
		System.out.println(al);
		System.out.println(" ");
		//add
		System.out.println("Add the elements:  ");
		al.add(2,25);
		System.out.println(al);
		System.out.println(" ");
		
		//replace or update
		System.out.println("Replace the elements: ");
		al.set(1,60);
		System.out.println(al);
		
		

	}

}
