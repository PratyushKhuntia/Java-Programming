package com.pratyush.practice.arrays;

public class Union {
	static int[] union(int a[],int b[])
	{ 
		int rs[]=new int[a.length+b.length];
		//int k=0;
		for (int i = 0; i < a.length; i++) {
			rs[i]=a[i];
		}
		int k=a.length;
		for (int i = 0; i < b.length; i++)
		{
			int find=1;
			for (int j = 0; j < a.length; j++) 
			{
				if(a[j]==b[i])
				{
					find=0;
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
