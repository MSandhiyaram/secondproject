package com.readDataFromKeyboard;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) 
	{
		
		String text;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the text");
		text=scanner.nextLine();
		System.out.println(text);
		scanner.close();
		
		

	}

}
