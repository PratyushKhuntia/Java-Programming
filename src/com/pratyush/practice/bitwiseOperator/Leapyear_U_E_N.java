package com.pratyush.practice.bitwiseOperator;

import java.util.Scanner;

public class Leapyear_U_E_N {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year :");
		int y=sc.nextInt();
		
		if(y%400==0 || y%4==0 && y%100!=0)
			System.out.println("Leap year");
		else
			System.out.println("Not Leap year");
	}

}
