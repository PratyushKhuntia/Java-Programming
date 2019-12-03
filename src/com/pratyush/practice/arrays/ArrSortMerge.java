package com.pratyush.practice.arrays;

import java.util.Scanner;

public class ArrSortMerge {
	int[] readArr()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many integer you hava");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter the "+n+" integer one by one ");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			
		}
		return a;
	}
	
	public void dispArr(int[] ar)
	{
		for (int i = 0; i < ar.length; i++)
		{
			if(i<ar.length-1)
				System.out.print(ar[i]+",");
			else
				System.out.println(ar[i]);
			
		}
	}

	public int[] sortMer(int[] a,int[] b)
	{
		int c[] = new int[a.length+b.length];
		
		int i=0,j=0,k=0;
		
		while (i<a.length&&i<b.length) {
			 c[k++]=a[i]<b[j]?a[i++]:b[j++];
		}
		while (i<a.length) {
			c[k++]=a[i++];
		}
		while (j<b.length) {
			c[k++]=b[j++];
		}
		return c;
	}
	  
}
	


