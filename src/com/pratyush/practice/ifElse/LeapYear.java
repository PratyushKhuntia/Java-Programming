package com.pratyush.practice.ifElse;

import java.util.Scanner;
class LeapYear
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year :");
		int f1=sc.nextInt();
		 
		 
		boolean leap = false;
        if(f1 % 4 == 0)
        {
            if( f1 % 100 == 0)
            {
                if ( f1 % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
        if(leap)
            System.out.println(f1 + " is a leap year.");
        else
            System.out.println(f1 + " is not a leap year.");
    }
	
}