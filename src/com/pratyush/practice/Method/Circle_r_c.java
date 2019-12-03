package com.pratyush.practice.Method;

import java.util.Scanner;

public class Circle_r_c {
	
	static void circleInfo(double radius)//called method
	{
		double area=3.143*radius*radius;
		double cir=2*3.143*radius;
		System.out.println("Area of "+radius+"radius Circle is: "+area);
		System.out.println("Circumfarence of "+radius+" radius of circle:"+cir);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r1=3.87;
		circleInfo(r1);
		System.out.println("---------------------------------------");
		
		circleInfo(5.6);
		System.out.println("---------------------------------------");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a radious :");
		double r2=sc.nextDouble();
		circleInfo(r2);
		System.out.println("---------------------------------------");
		
		
		
		
		
		
		

	}

}
