package com.collections;

import java.util.ArrayList;

public class Collection3 
{

	public static void main(String[] args) 
	{
		ArrayList<Student> al=new ArrayList<>();
		Student student=new Student(1,"Narmadha");
		al.add(student);
		al.add(new Student(2,"Sandhiya"));
		al.add(new Student(3,"Uma"));
		al.add(new Student(4,"Loga"));
		al.add(new Student(5,"pradnya"));
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
			//to print a specific value :
			//System.out.println(al.get(i).name);

		}
		System.out.println("  ");
		System.out.println("isEmpty         :"+al.isEmpty());
		System.out.println("indexof(student):"+al.indexOf(student));
		System.out.println("subList(0,4)    :"+al.subList(0, 4));
		al.clear();
		System.out.println("After clear: "+al);
		
//create a collection of Integer class type elements and perform all the operations
		//insert,delete,update,fetch
		
}

}

class Student
{
int id;
String name;

Student(int id,String name)
{
	this.id=id;
	this.name=name;
}


public String toString()
{
	return " "+id+" "+name;
}
}

	