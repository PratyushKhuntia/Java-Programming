package com.pratyush.practice.Method;

import java.util.Scanner;

public class Bmi {
	static void bmi(float feet,float weight)
	{
		 
		double height= feet*0.305;
        double bmi = (weight) / (height * height);
       
       System.out.println(bmi);
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter weight in Kilogram : ");
        float w = sc.nextFloat();
       
	   System.out.println("Enter Height in Feet : ");
        float f = sc.nextFloat();
        
        bmi(f,w);
	}

}
