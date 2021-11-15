package com.java.util;

public class SingleSynchronizedMethod {

	public static void main(String[] args) {
      Employee2 e1=Employee2.getEmpObject();
      Employee2 e2 =Employee2.getEmpObject();
      
      System.out.println(e1);
      System.out.println(e2);
	}

}

class Employee2
{
	public static Employee2 empref=null;
	public static Employee2 getEmpObject()
	{
		if(empref==null)
		{
			synchronized(Employee2.class)
			{
				empref=new Employee2();
			}
		}
		return empref;
		
	}
	private Employee2()
	{
		
	}
	
	
}