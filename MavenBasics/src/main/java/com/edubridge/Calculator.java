package com.edubridge;


public class Calculator 
{
	public char gradeCalculator(double percentage) 	
	{	
		/*
		 * >90==A
		 * >75==B
		 * >60==C
		 * >55==D
		 * >40==E
		 * below 40 F
		 * 
		 */
		if((percentage>=90)&&(percentage<100))
		{
			return 'A';
		}
		else if((percentage>=75)&&(percentage<90))
		{
			return 'B';
		}
		else if((percentage>=60)&&(percentage<75))
		{
			return 'C';
		}
		else if((percentage>=55)&&(percentage<60))
		{
			return 'D';
		}
		else if((percentage>=40)&&(percentage<55))
		{
			return 'E';
		}
		else
		{
			return 'F';
		}
		


	}
	public String checkEligibility(double percentage)
	{
		/*check percentage
		 * if percentage>90 return "Eligible"
		 * if below 90 "return "Not Eligible"
		 * invalid percentage return "Invalid"
		 * 
		 */
		
		if((percentage>=90)&&(percentage<100))
		{
			return "Eligible";
		}
		else if((percentage>=0)&&(percentage<90))
		{
			return "Not Eligible";
		}
		else
		{
			return "Invalid";
		}
		
		
	}
}
	



