package com.pratyush.practice.parttens;

public class Common {

	/* Rumbus
	int sp=n/2,st=1;
	for(int i=1;i<=n;i++)//line
	{
		 for(int j=1;j<=sp;j++)//  this is for blanks spaces
		{
			 
			System.out.print(" ");
			 
		}
		
		for(int j=1;j<=st;j++)// this is for star
		{
			 if(j==1||j==st)
			System.out.print((char)(st+65));
			 else
				 System.out.print(" ");
			 
		}
		if(i<=n/2)//this statement decrease one space and increase 2 stars
		{
			sp--;
			st=st+2;
		}
		else     //else increase 1 spaces decrease 2 stars
		{
			sp++;
			st=st-2;
		}
		System.out.println(" ");
	}
	
	
	
	int sp=0,st=n;//sp starts from 0 and star stars from n
		for(int i=1;i<=n;i++)//line
		{
			 for(int j=1;j<=sp;j++)//  this is for blanks spaces
			{ 
				System.out.print(" ");
				 
			}
			
			for(int j=1;j<=st;j++)// this is for star
			{
				 
				System.out.print("*");
				 
			}
			if(i<=n/2)//this statement increase one space and decrease 2 stars
			{
				sp++;
				st=st-2;
			}
			else     //else decrease 1 spaces increase 2 stars
			{
				sp--;
				st=st+2;
			}
			System.out.println(" ");
		}
		
		
		
		
		for(int i=1;i<=n;i++)//line+
		{
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=n-i;j++)//elements
			{
				System.out.print(" ");
				  				 
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}


*/
}