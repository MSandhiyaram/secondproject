package com.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;

public class Collection12QueueInterface 
{

	public static void main(String[] args) 
	{
		//Queue interface :
		// FIFO : First In First out
		// FCFS : First Come First Served
		// 

		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("Venkat");
		pq.add("Vaishnavi");
		pq.add("Ashish");
		pq.add("Akshat");
		pq.add("Supriya");
		pq.add("Sandhya");
		pq.offer("Narmadha");
		pq.offer("Karthik");

		System.out.println(pq);

		System.out.println(pq.contains("supriya"));
		System.out.println(pq.element());
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.remove());
		System.out.println(pq.remove("Kartik"));
		System.out.println(pq.size());
		System.out.println(pq);
		System.out.println(pq);

		System.out.println(pq);


	}

}
