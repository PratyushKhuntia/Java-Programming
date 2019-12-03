package com.pratyush.practice.inputPrograms;

import java.util.Scanner;
class Student
{
	public static void main(String arg[])
	{
		Scanner sub=new Scanner(System.in);
		
		System.out.println("Enter the mark of Physics :");
		double phy=sub.nextDouble();
		
		System.out.println("Enter the mark of Chimistry: ");
		double chem=sub.nextDouble();
		
		System.out.println("Enter the mark of Mathematics: ");
		double math=sub.nextDouble();
		
		System.out.println("Enter the mark of Biology: ");
		double bio=sub.nextDouble();
		
		double totalMarks=phy+chem+math+bio;
		System.out.println("Total marks gain :"+totalMarks);
		
		final int TOTAL=400;
		
		double percentage=(totalMarks/TOTAL)*100;
		System.out.println("Total percentage :"+percentage+"%");
	}
}