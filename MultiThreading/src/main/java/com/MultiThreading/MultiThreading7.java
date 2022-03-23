package com.MultiThreading;

//import java.util.Scanner;


public class MultiThreading7 
{
	

	public static void main(String[] args) 
	{
		MultiThreading11 mt1=new MultiThreading11();
		MultiThreading22 mt2=new MultiThreading22();
		MultiThreading33 mt3=new MultiThreading33();
		MultiThreading44 mt4=new MultiThreading44();
		mt1.setName("One");
		mt2.setName("Two");
		mt3.setName("Three");
		mt4.setName("Four");
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();
}
}
//resource
class Demo
{
	/*
	 * static synchronization is the process by which multiple threads using different instances of the class
	 * will not be able to interfere between the working of each other as the lock is applicable on the class not
	 * on the object.
	 * 
	 * 
	 * synchronized : means multiple threads will not be able to access the resource at one time
	 * 
	 * static : keyword will create only one copy of the resource made static 
	 * 
	 * 
	 * Deadlock : a situation when a thread is waiting for a resource which is occupied by another thread and 
	 * another thread is waiting for a resource which is occupied by first thread.So, both are waiting for each other
	 * to release the resource.
	 * 
	 * 
	 * 
	 */
	synchronized static void show(int n)
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName()+" : "+n*i);
		}
	}
}

class MultiThreading11 extends Thread
{
	public void run()
	{
		Demo.show(2);
	}
}


class MultiThreading22 extends Thread
{
	public void run()
	{
		Demo.show(10);
	}
}

class MultiThreading33 extends Thread
{
	public void run()
	{
		Demo.show(20);
	}
}

class MultiThreading44 extends Thread
{
	public void run()
	{
		Demo.show(5);
	}
}



