package com.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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

public class Collection19 
{

	public static void main(String[] args) 
	{
		ArrayList<Emp> al=new ArrayList<>();
		al.add(new Emp(21,"Jatin"));
		al.add(new Emp(19,"Jai"));
		al.add(new Emp(24,"Naman"));
		al.add(new Emp(23,"Divesh"));
		al.add(new Emp(22,"Shovan"));
		
		System.out.println(al);
		
		Collections.sort(al,new SortId());
		
		System.out.println(al);
		
		Collections.sort(al,new SortName());
		
		System.out.println(al);
		
	}
	

}
class Emp
{
	int empId;
	String empName;
	
	Emp(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	
	public String toString()
	{
		return empId+" "+empName;
	}
}

class SortId implements Comparator<Emp>
{

	@Override
	public int compare(Emp e1, Emp e2) {
		// TODO Auto-generated method stub
		if(e1.empId==e2.empId)
		{
			return 0;//no change in the index
		}
		else if(e1.empId>e2.empId)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}

class SortName implements Comparator<Emp>
{

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.empName.compareTo(o2.empName);
	}
	
}

