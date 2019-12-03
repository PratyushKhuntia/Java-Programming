package com.pratyush.practice.switchCase;

import java.util.Scanner;
 
class WeekNumber
{
	public static void main(String arg[])
	{
		 Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Numbers :");
		int wn = sc.nextInt();
		 String dayName="";
		 switch (wn) {
			case 1: dayName = "Sunday"; 
				break;
            case 2: dayName = "Monday"; 
				break;
            case 3: dayName = "Tuesday"; 
				break;
            case 4: dayName = "Wednesday";
				break;
            case 5: dayName = "Thursday"; 
				break;
            case 6: dayName = "Friday"; 
				break;
            case 7: dayName = "Saturday";
				break;
            
            default:dayName = "Invalid day range";
        }
		System.out.println(dayName);
		 
	}
}