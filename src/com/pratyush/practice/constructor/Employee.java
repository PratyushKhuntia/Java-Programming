package com.pratyush.practice.constructor;

public class Employee {
	int id;
	String name;
	double sal;
	
	public Employee(int id,String name,double sal) {
		 this.id=id;
		 this.name=name;
		 this.sal=sal;
		 
	}
	
	public Employee(Employee e) {//copy constructor
		
		this.id = e.id;
		this.name = e.name;
		this.sal = e.sal;
	}

	void empInfo()
	{
		System.out.println("Id: "+id);
		System.out.println("Id: "+name);
		System.out.println("Id: "+sal);
	}
	
	public static void main(String[] args) {
		
	}

}
