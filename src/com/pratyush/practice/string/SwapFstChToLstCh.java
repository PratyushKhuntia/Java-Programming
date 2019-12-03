package com.pratyush.practice.string;

import java.util.Scanner;

public class SwapFstChToLstCh {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st String");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				int k=i;
				while(i<ch.length&&ch[i]!=' ')
				{
					i++;
				}
				char t=ch[k];
				ch[k]=ch[i-1];
				ch[i-1]=t;
			}
		}
		st=new String(ch);
		System.out.println(st);
	}

}
