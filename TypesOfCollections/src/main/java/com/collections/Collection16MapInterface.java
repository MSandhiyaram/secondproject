package com.collections;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collection16MapInterface 
{

	public static void main(String[] args) 
	{

		//Map interface :
		/*
		 * Map interface is another branch which is seperate from the hierarchy of Collection
		 * interface.
		 * 
		 * It provides the architecture to store data in key-value pairs.
		 * The pair is referred as 'ENTRY'.
		 * 
		 * Features :
		 * 1) Map does not allow duplicacy of keys.
		 * 2) Duplicacy of values is permitted.
		 * 3) We can have 1 null key and multiple null values.
		 *  Map has been implemented by set of classes :
		 *  The hierarchy is :
		 *  Map--> 
		 *  LinkedHashMap class 
		 *  HashMap class
		 *  SortedMap interface--> TreeMap class
		 *  
		 *  LinkedHashMap class :
		 *  1) maintains insertion order
		 *  
		 *  HashMap class :
		 *  1) doesn't maintain any order.
		 *  
		 *  TreeMap class :
		 *  1) maintains ascending order on the basis of key.
		 *  
		 *  Map.Entry is another interface through which we can traverse of entries of a
		 *  map collection.
		 * 
		 */

		HashMap<Integer,String> lhm=new HashMap<>();
		lhm.put(1, "Jaya");
		lhm.put(5, "Jaya");
		lhm.put(3, "Priya");
		lhm.put(8, "Shreya");
		lhm.put(2, "Neha");
		System.out.println(lhm);
		lhm.put(1,"Vaishnavi");
		System.out.println(lhm);
		lhm.putIfAbsent(4,"Geetika");
		System.out.println(lhm);
		HashMap<Integer,String> lhm1=(HashMap<Integer,String>)lhm.clone();
		System.out.println(lhm.containsKey(2));
		System.out.println(lhm.containsValue("Neha"));
		System.out.println(lhm.equals(lhm1));
		System.out.println(lhm.get(7));
		System.out.println(lhm.getOrDefault(3,"Narmadha"));
		System.out.println(lhm.isEmpty());
		System.out.println(lhm.remove(3));
		System.out.println(lhm.replace(5, "Vaishu"));
		System.out.println(lhm);
		HashMap<Integer,String> lhm2=new HashMap<>();
		lhm2.putAll(lhm);
		System.out.println(lhm2);
		System.out.println(lhm.size());
		//traverse over the Map collection
		for(Map.Entry<Integer,String> hm:lhm.entrySet())
		{
			System.out.println(hm.getKey()+" "+hm.getValue());
		}


	}

}
