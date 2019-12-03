package com.pratyush.practice.inputPrograms;

import java.util.Scanner;
class Rectangle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Length");
		float len=sc.nextFloat();
		
		System.out.println("Enter the Breath");
		float bre=sc.nextFloat();
		
		float area=len*bre;
		System.out.println("Area = "+area);
		
		float peri=2*(len+bre);
		System.out.println("Perimeter = "+peri);
	}
}