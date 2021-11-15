package com.java.util;

public class SingletoneUsingSyn {

	public static void main(String[] args) {
      Employee1 e1=Employee1.getEmpObject();
      Employee1 e2=Employee1.getEmpObject();
      
      System.out.println(e1);
      System.out.println(e2);
    		  
	}

}

class Employee1
{
	public static Employee1 emp=null;
	
	synchronized public static Employee1 getEmpObject()
	{
		if(emp==null)
		{
			emp=new Employee1();
		}
		return emp;
		}
	private Employee1()
	{
		
	}

}

