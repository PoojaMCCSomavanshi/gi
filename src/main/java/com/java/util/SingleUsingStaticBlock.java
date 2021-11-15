package com.java.util;

public class SingleUsingStaticBlock {

	public static void main(String[] args) {
     Employee e1=Employee.empref;
     Employee e2=Employee.empref;
     
     System.out.println(e1);
     System.out.println(e2);
	}

}

class Employee
{
	public static Employee empref=null;
	static
	{
		try
		{
			empref=new Employee();
			
		}
		
		catch(Exception e)
		{
			System.out.println("ERROR ");
		}
	}
}