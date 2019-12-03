package com.pratyush.practice.Method;

import java.util.Scanner;

public class Rectangle_A_P {
	
	static void rectangleInfo(double length,double breath)
	{
		double area = length * breath;
		double perimeter = 2*(length+breath);
		System.out.println("Area of the Rectangle ="+area);
		System.out.println("Perimeter of the Rectangle ="+perimeter);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of a Rectangle :");
		double l=sc.nextDouble();
		System.out.println("Enter Breath of a Rectangle :");
		double b=sc.nextDouble();
		rectangleInfo(l,b);
	}

}
