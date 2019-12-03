package com.pratyush.practice.inputPrograms;

import java.util.Scanner;
class Calculate
{
	public static void main(String arg[])
	{
		//final PI = 4.142;
		
		Scanner cl=new Scanner(System.in);
		System.out.println("Enter the Radius");
		
		float r =cl.nextFloat();
		
		double area = 4.141*r*r;
		
		System.out.println("Area = "+area);
		
		double cer = 2*4.141*r;
		System.out.println("Circumafarenace ="+cer);
		
	}
}