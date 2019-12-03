package com.pratyush.practice.arrays;

public class InsertAnotherArr {
	static int[] insertArr(int a[],int b[],int in)
	{
		if(in<0||in>=a.length)
		{
			System.out.println("Index not in range");
			return a;
		}
		int n[]=new int[a.length+b.length];
		for (int i = 0; i < b.length; i++) {
			n[in+i]=b[i];
			
		}
		for (int i = 0; i < a.length; i++) {
			if (i<in)
				n[i]=a[i];
			else
				n[b.length+1]=a[i];
				
		}
		return n;
	}


}
