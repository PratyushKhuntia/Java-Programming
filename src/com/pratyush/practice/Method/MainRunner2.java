package com.pratyush.practice.Method;

public class MainRunner2 {
	public static void main(String[] args) //calling method
	{
		System.out.println("Main com.pratyush.practice.Method Starts");
		System.out.println("Ravi Kumar");
		fun(); //calling method
		System.out.println("Rakesh");
		fun();
		System.out.println("Main com.pratyush.practice.Method End");
	}
	
	static void fun() //called method
	{
		System.out.println("Hello");
		System.out.println("How are You");
	}

}
