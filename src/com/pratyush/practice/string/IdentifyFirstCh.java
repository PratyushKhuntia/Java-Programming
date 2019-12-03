package com.pratyush.practice.string;

import java.util.Scanner;

public class IdentifyFirstCh {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//countWords(str);
		
	}
	
	int countWords(String st)
	{
		int count=0;
		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(i==0&&ch[i]==' '||ch[i]!=' '&&ch[i-1]==' ')
				count++;				
		}
		return count;
	}

}
