package com.java.util;

public class BuilderPattern {

	public static void main(String[] args) {
		Student3 s1=new Student3.InnerStudent("m1","m2","m3").build();
		Student3 s2=new Student3.InnerStudent("m1","m2","m3").setM4("m4").setM5("m5").build();
   
		
		System.out.println(s1);
		System.out.println(s2);
	
	}

}

class Student3
{
	public String m1;
	public String m2;
	public String m3;
	public String m4;
	public String m5;

	public Student3(InnerStudent innerStudent)
	{
		this.m1 = innerStudent.m1;
		this.m2 = innerStudent.m2;
		this.m3 = innerStudent.m3;
		this.m4 = innerStudent.m4;
		this.m5 = innerStudent.m5;



	}


	@Override
	public String toString() {
		return "Student3 [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4 + ", m5=" + m5 + "]";
	}


	static class InnerStudent
	{
		private String m1;
		private String m2;
		private String m3;
		private String m4;
		private String m5;
		public InnerStudent(String m1, String m2, String m3) {
			super();
			this.m1 = m1;
			this.m2 = m2;
			this.m3 = m3;

		}

		public String getM4() {
			return m4;
		}
		public InnerStudent setM4(String m4) {
			this.m4 = m4;
			return this;
		}
		public String getM5() {
			return m5;
		}
		public InnerStudent setM5(String m5) {
			this.m5 = m5;
			return this;
		}
		@Override
		public String toString() {
			return "InnetStudent [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4 + ", m5=" + m5 + "]";
		}

		public Student3 build() {
			return new Student3(this);
		}


	}

}