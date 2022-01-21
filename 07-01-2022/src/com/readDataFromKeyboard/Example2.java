package com.readDataFromKeyboard;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) 
	{
		
		String name;
		int age;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the name:");
		name=scanner.nextLine();
		System.out.println("enter the age:");
		age=scanner.nextInt();
		System.out.println("*******************");
		System.out.println(name);
		System.out.println(age);
		scanner.close();
		
		
		
		
		
	}

}
