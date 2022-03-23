package com.LinkedlistAndMethods;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Collection6LinkedList2Task 
{


//	create an integer collection using linkedlist
//	and perform the following operations:
//	1)add 10 elements from user
//	2)sort the elements in ascending as well as descending order
//	3)return the highest and lowest element of the collection
//	4)find the most frequent(repeated) element
	public static void main(String[] args) 
	{
		Scanner snc=new Scanner(System.in);
		System.out.println("Enter size: ");
		int size=snc.nextInt();
		System.out.println("Enter "+size+" elements: ");



		LinkedList<Integer> ll=new LinkedList<Integer>();
		for(int i=0;i<size;i++)
		{
			ll.add(snc.nextInt());
		}
		snc.close();
		System.out.println("List in Elements: ");
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		//Descending order
		System.out.println("Descending Order");
		Collections.sort(ll);
		System.out.println(ll);

		//Ascending order
		System.out.println("Ascending Order");
		Collections.sort(ll, Collections.reverseOrder());  
		System.out.println(ll);

		// Return the highest and lowest element of the collection
		System.out.println(" Its Display lowest and highest elements...");
		System.out.println(ll.peekLast());
		System.out.println(ll.peekFirst());

		//Repeated Element
		System.out.println("Repeated Elements");
		int max=0;
		int count=1;
		int maxElement=0;
		for (int i = 0; i < ll.size() - 1; i++)               
		{
			count = 1;
			for (int j = i + 1; j < ll.size(); j++) 
			{
				if (ll.get(i) == ll.get(j)) 
				{
					count++;
				}
			}
			if (count > max) 
			{
				max = count;
				maxElement = ll.get(i);
				//loop through the array elements
			}
		}
		System.out.println(max);
		System.out.println(maxElement);
		snc.close();
	}

}