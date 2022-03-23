package com.edubridge;

import static org.junit.Assert.assertArrayEquals;
//import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;
public class CalculatorTest 
{
	@Test
	public void testGradeCalculator() 
	{
		Calculator calculator=new Calculator();
		char result=calculator.gradeCalculator(120);
		assertEquals('F',result);
		
	}
	@Test
	public void testGradeCalculator1() 
	{
		Calculator calculator=new Calculator();
		char result=calculator.gradeCalculator(70);
		assertEquals('C',result);
		
	}
	@Test
	public void testEligibility()
	{
		Calculator calculator=new Calculator();
		String output=calculator.checkEligibility(90);
		assertEquals("Eligible",output);
		
	}
	@Test
	public void testEligibility1()
	{
	Calculator calculator=new Calculator();
	String output=calculator.checkEligibility(56);
	assertEquals("Not Eligible",output);
	}
	@Test
	public void testValue()
	{
		Calculator calculator=new Calculator();
		String str="calculator";
		String str1="calculator";
		assertSame(str,str1);
		
	}
	
	@Test
	public void testValue1()
	{
		Calculator calculator=new Calculator();
		String str=new String ("calculator");
		String str1=new String("calculator");
		assertSame(str,str1);
	}
	
	@Test
	public void array1()
	{
		Calculator calculator=new Calculator();
		String arr[]= {"A","B","C"};
		String arr1[]= {"a","b","c"};
		assertArrayEquals(arr,arr1);
	}


}
