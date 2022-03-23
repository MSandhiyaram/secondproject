package com.MultiThreading;

//import java.util.Scanner;


public class MultiThreading6 
{
	//Synchronized block

	public static void main(String[] args) 
	{
		Sample1 sample1=new Sample1();
		My11 my11=new My11(sample1);
		My12 my12=new My12(sample1);
		my11.start();
		my12.start();
		
		
		
		/*
		 * t1---- 
		 * t2----R1(sync)
		 * 
		 * t3---
		 * t4---R2(sync)
		 * 
		 * 
		 * t1.start();
		 * t2.start();
		 * t3.start();
		 * t4.start();
		 * 
		 */
		
		
		
	}

}
class Sample1
{
	void show(int num)
	{	
		synchronized(this)
		{
			for(int i=1;i<=10;i++)
			{
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
				
				}
				System.out.println(Thread.currentThread().getName()+" : "+(num*i));
			}
		}
		
	}
}

class My11 extends Thread
{
	Sample1 sample;
	
	My11(Sample1 sample)
	{
		this.sample=sample;
	}
	
	public void run()
	{
		sample.show(2);
	}
}

class My12 extends Thread
{
	Sample1 sample;
	
	My12(Sample1 sample)
	{
		this.sample=sample;
	}
	
	public void run()
	{
		sample.show(20);
	}
}
		