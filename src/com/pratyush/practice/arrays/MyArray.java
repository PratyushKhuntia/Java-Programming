 package com.pratyush.practice.arrays;

import java.util.Scanner;

public class MyArray {
	
	int sumOfArray(int[] ar)
	{
		int sum=0;
		for (int i = 0; i < ar.length; i++) {
			sum=sum+ar[i];
		}
		return sum;
	}
	
	int[] readArr()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many integer you hava");
		int n=sc.nextInt();
		
		int ar[]=new int[n];//Create n size array.
		
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

	public int[] merge(int[] a,int[] b)
	{
		int c[] = new int[a.length+b.length];
		for(int i=0;i< a.length;i++)
		{
			c[i]=a[i];
			
		}
		for(int i=0;i< b.length;i++)
		{
			c[i+a.length]=b[i];
			
		}
		return c;
	}
	
	
	public int[] countEO(int[] a)
	{
		int count[]= {0,0};
		for (int i = 0; i < a.length; i++) {
			count[a[i]%2]++;
			
			
		}
		return count;
	}
	
	public void dispPair(int[] a,int n)
	{
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]+a[j] == n)
				{
					System.out.println(a[i]+","+a[j]);
				}
				
			}	
		}
	}
	
	
}







