package com.pratyush.practice.string;

public class CountStr2WordInStr1 {
	public static void main(String[] args) {
		String s1="chitradurga is a fort city";
		String s2="fort";
		boolean rs=isWordStr(s1,s2);
		if(rs)
			System.out.println("yes");
		else
			System.out.println("no");
	}
	private static boolean isWordStr(String s1,String s2)
	{
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			int k=i,j=0;
			while(k<c1.length&&j<c2.length&&c1[k]==c2[j])
			{
				j++;
				k++;
			}
			if(j==c2.length)
			{
				if((i==0||c1[i-1]==' ')&&(k==c1.length||c1[k]==' '))
				return true;
			}
		}
		
		return false;
	}



}
