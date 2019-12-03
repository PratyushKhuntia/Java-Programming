package com.pratyush.practice.Method;

public class Convert{
	public static void main(String[] args) {
		ConvertM con = new ConvertM();
		int b=101101;
		int o=768;
		String h="A6b9";
		System.out.println("Decimal equalent of "+b+" is "+con.binToDec(b));
		System.out.println("Decimal equalent of "+o+" is "+con.octToDec(o));
	}
	
}



class ConvertM {
	 
	
	String decToBin(int dec)
	{
		String bin="";
		do {
			int r=dec%2;
			bin=r+bin;
			dec=dec/2;
		} while (dec!=0);
		return bin;
	}

	String decToOct(int dec)
	{
		String oct="";
		do {
			int r=dec%8;
			oct=r+oct;
			dec=dec/8;
		} while (dec!=0);
		return oct;
	}
	
	String decToHex(int dec)
	{
		String hex="";
		do {
			int r=dec%16;
			if(r<10)
			hex=r+hex;
			else
				hex=(char)(r+55)+hex;
			dec=dec/16;
		} while (dec!=0);
		return hex;
	}
	
	int pow(int n,int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
	
	int binToDec(int bin)
	{
		int dec=0,c=0;
		do {
			int r=bin%10;
			dec=dec+r*pow(2,c);
			c++;
			bin=bin/10;
			
		} while (bin!=0);
		return dec;
	}
	
	int octToDec(int oct)
	{
		int c=0,dec=0;
		do {
			int r=oct%10;
			dec=dec+r*pow(8,c++);
			 
			oct=oct/10;
			
		} while (oct!=0);
		return dec;
	}
	
	int hexToDec(String hex)
	{
		int dec=0,c=0;
		for (int i = hex.length()-1; i >=0; i--) 
		{
			int r=0;
			char ch=hex.charAt(i);
			if(ch>='A'&&ch<='Z')
				r=ch-55;
			else if(ch>='a'&&ch<='z')
				r=ch-87;
			else
				r=ch-48;
			dec=dec+r*pow(16,c++);
			
			
		}
		return dec;
	}
	
	
	

}
