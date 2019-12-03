package com.pratyush.practice.string;

public class Str2PartOfStr1 {
	public static void main(String[] args) {
		String s1="chitradurga is afort city";
		String s2="durga";
		boolean rs=isSubStr(s1,s2);
		if(rs)
			System.out.println("yes");
		else
			System.out.println("no");
	}
	private static boolean isSubStr(String s1,String s2)
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
				return true;
		}
		
		return false;
	}

}
