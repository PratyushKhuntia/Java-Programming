package com.pratyush.practice.string;

public class CountStr2InStr1 {
	public static void main(String[] args) {
		String s1="anand and anurad and anusha";
		String s2="and";
		int c=countSubStr(s1,s2);
		System.out.println(c);
	}
	private static int countSubStr(String s1,String s2)
	{
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		int count=0;
		for (int i = 0; i < c1.length; i++) {
			int k=i,j=0;
			while(k<c1.length&&j<c2.length&&c1[k]==c2[j])
			{
				j++;
				k++;
			}
			if(j==c2.length)
			{
				count++;
				i=k-1;
			}
		}
		
		return count;
	}


}
