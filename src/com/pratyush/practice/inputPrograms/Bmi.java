package com.pratyush.practice.inputPrograms;

import java.util.Scanner;
class Bmi
{
	 public static void main(String[] args) 
	 {
        Scanner sc = new Scanner(System.in);
		 
        System.out.println("Enter weight in Kilogram : ");
        float weight = sc.nextFloat();
       
	   System.out.println("Enter Height in Feet : ");
        float feet = sc.nextFloat();
		
		double height= feet*0.305;
        double bmi = (weight) / (height * height);
       
       System.out.println(bmi);
     }   
}