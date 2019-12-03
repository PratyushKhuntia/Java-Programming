package com.pratyush.practice.arrays;

import java.util.Scanner;

public class ZigZag {
	int[] readArr()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many integer you hava");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		
		System.out.println("Enter the "+n+" integer one by one ");
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
			
		}
		return ar;
	}
	
	public void dispArr(int[] ar)
	{
		for (int i = 0; i < ar.length; i++)
		{
			if(i<ar.length-1)
				System.out.println(ar[i]+",");
			else
				System.out.println(ar[i]);
			
		}
	}

	 
	
	public int[] zigzag(int[] a,int[] b)
	{
		int c[] =new int[a.length+b.length];
		int i=0,k=0;
		while (i<a.length&&i<b.length) {
			c[k++]=a[i];
			c[k++]=b[i++];
		}
		while (i<a.length) {
			c[k++]=a[i++];
		}
		while (i<b.length) {
			c[k++]=b[i++];
		}
		return c;
	}

}
