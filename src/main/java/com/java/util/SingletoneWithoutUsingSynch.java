package com.java.util;

public class SingletoneWithoutUsingSynch {

	public static void main(String[] args) {
      
		College c1=College.getCollegeObject();
		College c2=College.getCollegeObject();
		System.out.println(c1);
		System.out.println(c2);
	}

}


class College
{
	public static College clg=null;
	
	public static College getCollegeObject()
	{
		if(clg==null) {
		 clg=new College();
		}
		return clg;
		
	}
	
	private College()
	{
		
	}
}