package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionTaskusingEmpWithprivateMem 
{

	public static void main(String[] args) 
	{
		ArrayList<Employee> al=new ArrayList<>();
		Employee emp=new Employee();
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		
		emp.setId(1);
		emp.setName("Sandhiya");
		emp.setSal(25000);
		al.add(emp);
		
		emp1.setId(2);
		emp.setName("Uma");
		emp.setSal(30000);
		al.add(emp1);
		
		emp1.setId(3);
		emp.setName("Narmadha");
		emp.setSal(40000);
		al.add(emp2);
		
		//With Stream
		List<String> empName=al.stream()
				.filter(empl -> empl.getSal()>30000)
				.map(Employee::getName)
				.collect(Collectors.toList());
		System.out.println(empName);
		
		//this will print all the values
		List<Employee> empName1=al.stream()
				.filter(empl -> empl.getSal()>30000)
				//.map(Employee::getName)
				.collect(Collectors.toList());
		System.out.println(empName1);
		

	}

}

class Employee
{
	private int id;
	private String name;
	private double sal;
	public Employee(int id, String name, double sal) 
	{
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	 public String toString(){
		    return "  id->  " + this.id + "  name->  " + this.name + "  sal->  " + this.sal;
	 }
	
}