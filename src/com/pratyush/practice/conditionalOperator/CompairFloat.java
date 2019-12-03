package com.pratyush.practice.conditionalOperator;

import java.util.Scanner;
class CompairFloat
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First floating poing number :");
		float f1=sc.nextFloat();
		System.out.println("Enter second floating point number :");
		float f2=sc.nextFloat();
		
		 String st=(f1==f2)?"Same":"Different";
		  System.out.println(f1+" and "+f2+" are "+st+".");
	}
	
}