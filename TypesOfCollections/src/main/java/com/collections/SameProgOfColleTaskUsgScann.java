package com.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class SameProgOfColleTaskUsgScann 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=scanner.nextInt();
		System.out.println("Enter "+size+" elements: ");
		ArrayList<Integer> al= new ArrayList<>();
		//add
		for(int i=0;i<size;i++)
		{
			al.add(scanner.nextInt());
		}
		scanner.close();
		System.out.println("Elements in list: ");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		//remove
		al.remove(3);
		al.remove(Integer.valueOf(10));
		//replace or update
		al.set(0,12);
		System.out.println("Elements in list after update: ");
		//fetch
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
	}
	}
	