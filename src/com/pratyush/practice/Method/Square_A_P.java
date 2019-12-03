package com.pratyush.practice.Method;

import java.util.Scanner;

public class Square_A_P {
	static void squareInfo(double side)
	{
		double area = side*side;
		double perimeter = 4*side;
		System.out.println("Area of "+side+" Side Square is "+area);
		System.out.println("Perimeter of "+side+" Side Square is "+perimeter);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Side of a Square :");
		double a=sc.nextDouble();
		squareInfo(a);
		
		
	}

}
