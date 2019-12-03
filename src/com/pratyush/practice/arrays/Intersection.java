package com.pratyush.practice.arrays;

public class Intersection {
	static int[] intersect(int a[],int b[])
	{ 
		int rs[]=new int[a.length];
		int k=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i]==b[j])
				{
					rs[k++]=a[i];
					break;
				}
			}
		}
		int n[]=new int[k];
		for (int i = 0; i <k; i++) {
			n[i]=rs[i];
			
		}
		return n;
	}


}
