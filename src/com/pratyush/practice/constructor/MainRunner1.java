package com.pratyush.practice.constructor;

public class MainRunner1 {
	public MainRunner1() {
		// TODO Auto-generated constructor stubn
		Employee e1 = new Employee(123,"eqq",46532.44);
		e1.empInfo();
		/*
		Employee e2=e1;
		e2.name="tejus";
		e1.empInfo();
		*/
		
		System.out.println("--------------------------");
		Employee e3=new Employee(e1.id,e1.name,e1.sal);
	     e3.empInfo();
		
	}

}
