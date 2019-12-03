package com.pratyush.practice.arrays;

import java.util.Scanner;

public class ArrayMeth {
	public static void main(String[] args) {
		
	   MyArray ma=new MyArray(); 
	   
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many integer you hava");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		
		System.out.println("Enter the "+n+" integer one by one ");
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
			
		}
		int s=ma.sumOfArray(ar);
		System.out.println("Sum is :"+s);

}
}