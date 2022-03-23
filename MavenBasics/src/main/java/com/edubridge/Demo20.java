package com.edubridge;


public class Demo20
{
	private int a;
	int b=60;
	protected int c=100;
	public int d=25;


	void display()
	{
		System.out.println("Private : " +a);
		System.out.println("Default :  " +b);
		System.out.println("protected  : " +c);
		System.out.println("public  : "+ d);

	}
	public int getA() 
	{
		return a;
	}
	public void setA(int a) 
	{
		this.a = a;
	}
	
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	void show()
	{
		a=10;
		System.out.println(a);
	}
	
	

}




/*
 * private>default>protected>public 
 * class cannot be private and protected.
 * private : only within the class it has been declared.
 */