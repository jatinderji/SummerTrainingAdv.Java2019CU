package com.jatin;

public class Student {
	
	private int rollno;
	private String name,course;
	
	public int getRollno()
	{		return rollno;		}
	
	Student(int r,String n,String c)
	{
		rollno = r;
		name = n;
		course = c;
	}
	public void show()
	{
		System.out.println(rollno+"\t\t"+name+"\t\t"+course);
	}
}
