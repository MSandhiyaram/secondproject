package com.edubridge;

public class AccessModifierExmp2 
{
	public static void main(String[] args) 
	{

		Demo d=new Demo();
		d.setA(6);
		int result=d.getA();
		System.out.println(result);
		
		d.b=23;
		d.display();
		System.out.println("Protected Member c : "+d.c);
		

	}
}
class Demo11
{
	private int a;
	int b;
	protected int c=100;
	public int d;


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

}



/*
 * private>default>protected>public 
 * class cannot be private and protected.
 * private : only within the class it has been declared.
 */