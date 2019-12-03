package com.pratyush.practice.conditionalOperator;

import java.util.Scanner;
class Number
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		 
		 String st=(n>0)?"+ve":"-ve";
		  System.out.println(n+" is a "+st+" number.");
	}
	
}