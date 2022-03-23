package com.MultiThreading;

//import java.util.Scanner;

public class MultiThreading3 
{
	
	

	public static void main(String[] args) 
	{
		MyThread2 myThread2=new MyThread2();
		Thread t1=new Thread(myThread2);
		t1.start();
	
	}
}

class MyThread2 implements Runnable
{

	@Override
	public void run() {
		Thread t2=Thread.currentThread();
		System.out.println("Started My Thread : "+t2.getState());
		System.out.println(t2.isAlive());
		
	}
	
}