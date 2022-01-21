package com.readDataFromKeyboard;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		
		  double r;
		
		  double area;
		  Scanner scanner= new Scanner(System.in);
          System.out.println("Enter the radius:");
          r= scanner.nextDouble();
          area=(22*r*r)/7 ;
          System.out.println("Area of Circle is: " + area); 
          scanner.close();

	}

}
