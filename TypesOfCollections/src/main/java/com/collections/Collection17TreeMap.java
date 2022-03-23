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

public class Collection17TreeMap 
{

	public static void main(String[] args) 
	{
		TreeMap<String,emplo> lhm=new TreeMap<>();
		emplo emp1=new emplo(12,"Geetika");
		emplo emp2=new emplo(67,"Shreya");
		emplo emp3=new emplo(56,"Maneet");
		emplo emp4=new emplo(45,"Haneet");
		
		lhm.put("B", emp1);
		lhm.put("A", emp2);
		lhm.put("D", emp3);
		lhm.put("C", emp4);
		
		System.out.println(lhm);
		
		for(Map.Entry<String,emplo> hm:lhm.entrySet())
		{
			System.out.println(hm.getKey()+" "+hm.getValue().id+" "+hm.getValue().name);
		}
		

	}

}

class emplo
{
	int id;
	String name;

	public emplo(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}
	public String toString()
	{
		return id+" "+name;
	}
}


//Comparable and Comparator : sort user defined collection
//Stream API : 