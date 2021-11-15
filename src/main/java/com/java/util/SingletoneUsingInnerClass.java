package com.java.util;

import com.java.util.Emp.InnerEmp;

public class SingletoneUsingInnerClass {

	public static void main(String[] args) {
      Emp e1=Emp.InnerEmp.getEmpInstnace();
      Emp e2=Emp.InnerEmp.getEmpInstnace();
      
      System.out.println(e1);
      System.out.println(e2);
      
      
      
	}

}

class Emp
{
	private Emp()
	{
		
	};
	static class InnerEmp{
		static Emp empref = new Emp();		// lazy loaded..
		public static Emp getEmpInstnace() {
			return empref;
		}
	}
}
