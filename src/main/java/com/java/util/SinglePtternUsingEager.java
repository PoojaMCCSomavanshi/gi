package com.java.util;

public class SinglePtternUsingEager {

	public static void main(String[] args) {
     Student s1=Student.studref;
     Student s2=Student.studref;
     
     System.out.println(s1);
     System.out.println(s2);
	}

}

class Student
{
	public static Student studref=new Student();
			Student()
			{
		
			}

}