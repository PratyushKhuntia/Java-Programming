package com.pratyush.practice.arrays;

public class MinusArray {
	int[] minus(int a[],int b[])
	{ 
		int c[]=new int[a.length];
		int k=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i]==b[j])
				{
					break;
				}
				if(j==b.length-1)
				{
					c[k++]=a[i];
				}
			}
		}
		int n[]=new int[k];
		for (int i = 0; i < n.length; i++) {
			n[i]=c[i];
			
		}
		return n;
	}

}
