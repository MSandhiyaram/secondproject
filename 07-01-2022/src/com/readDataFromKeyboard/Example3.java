package com.readDataFromKeyboard;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) 
	
	{
		
		int num1;
		int num2;
		int sum;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter 1st number:");
		num1=scanner.nextInt();
		System.out.println("enter 2nd number:");
		num2=scanner.nextInt();
		sum=num1+num2;
		System.out.println("*********************");
		System.out.println(sum);
		scanner.close();
		
	}

}
