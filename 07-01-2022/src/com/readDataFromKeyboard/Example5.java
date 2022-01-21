package com.readDataFromKeyboard;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		double l;
		double b;
		double area;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the length:");
		l=scanner.nextFloat();
		System.out.println("enter the breath:");
		b=scanner.nextFloat();
		area=l*b;
		System.out.println("area of rectangle is:"+area);
		area=scanner.nextDouble();
		scanner.close();
		
		
		
		

	}

}
