package com.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApi1 
{

	public static void main(String[] args) 
	{

		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee(1,"Sandhiya",45000));
		al.add(new Employee(2,"Priya",35000));
		al.add(new Employee(4,"Ramya",40000));
		al.add(new Employee(3,"Suriya",47000));
		al.add(new Employee(6,"Rahul",25000));
		
		ArrayList<Double> salaryList=new ArrayList<>();
		//Without Stream
		int min=30000;
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).salary>min)
			{
				salaryList.add(al.get(i).salary);
			}
		}
		System.out.println(salaryList);
		System.out.println("*******************************************");
		
		//with stream
		List<Double> salaryList1=al.stream()//returns sequential stream
								.filter(emp -> emp.salary>30000)//condition application
								.map(emp->emp.salary)//fetching a single element
								.collect(Collectors.toList());//binding into list
		
		Set<Double> salaryList2=al.stream()
				.filter(emp -> emp.salary>30000)
				.map(emp->emp.salary)
				.collect(Collectors.toSet());

		
		System.out.println(salaryList1);
		System.out.println(salaryList2);
		System.out.println("***********************************************");

		
		List<String> empNames=al.stream()//returns sequential stream
				.map(emp->emp.name)//fetching a single element
				.collect(Collectors.toList());//binding into list
		System.out.println(empNames);
		//names of employee whose salary is greater than 30000
		System.out.println("***********************************************");

		
		List<String> empNamesHigh=al.stream()//returns sequential stream
				.filter(emp -> emp.salary>30000)//condition application
				.map(emp->emp.name)//fetching a single element
				.collect(Collectors.toList());//binding into list
		System.out.println(empNamesHigh);
		System.out.println("***********************************************");

		
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).salary>30000)
			{
				System.out.println(al.get(i).name+" "+al.get(i).salary);
			}
		}
		System.out.println("***********************************************");

		
		al.stream()
		.filter(emp -> emp.salary>30000)
		.forEach(emp->System.out.println(emp.name+" "+emp.salary));
		
		
		
	}

}

class Employee
{
	int id;
	String name;
	double salary;
	//Parameterized constructor
	public Employee(int id, String name, double salary) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}	
}

/*
 * Employee
 * id,name,salary private member variables
 * 
 * getter and setter
 * 
 * adding the object into collection using setter methods
 * 
 * 
 * 
 */
/*
 * 
 * 
 * By using stream API, we are allowed to write functional style operations.
 * stream would be useful to work with collections
 * 
 * Features :
 * 1)stream will not store the elements. It will simply perform the operation through the methods used on the
 * specific data structure.Operation will be performed but actual source will not be modified.
 * 2)less memory will be consumed.
 * 3)Streams can be used to filter,collect,summarize(sum,min,max,average) and print the data 
 * 4)Streams are lazy and evaluates the code when required.
 */
