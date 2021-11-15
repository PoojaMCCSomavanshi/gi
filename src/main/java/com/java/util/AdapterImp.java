package com.java.util;

public class AdapterImp {

	public static void main(String[] args) {
     Tiger t=new Tiger();
     t.eat();
     t.sleep();
	}

}

interface Animal
{
	public void sleep();
	public void eat();
	
}
class Tiger implements Animal
{
	public void sleep()
	{
		System.out.println("Tiger is slewping");
	}
	public void eat()
	{
		System.out.println("Tiger is eating");
	}
	
}
