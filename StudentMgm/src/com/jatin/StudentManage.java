package com.jatin;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentManage {
	
	ArrayList<Student> students=null;

	StudentManage()
	{
		students = new ArrayList<Student>();
	}
	public void registerStudent(int r,String n,String c)
	{
		students.add(new Student(r,n,c));
		System.out.println("Student Registered..");
	}
	public void showStudents()
	{
		Iterator<Student> itr= students.iterator();
		System.out.println("Rollno\t\tName\t\tCourse");
		while(itr.hasNext())
		{
			itr.next().show();
		}
	}
	public void search(int r)
	{
		Iterator<Student> itr= students.iterator();
		while(itr.hasNext())
		{
			Student st= itr.next();
			if(st.getRollno()==r)
			{
				st.show();
				return;
			}
		}	
		System.out.println("Sorry! No student registered.");
	}
	public void removeStd(int r)
	{
		Iterator<Student> itr= students.iterator();
		while(itr.hasNext())
		{
			Student st= itr.next();
			if(st.getRollno()==r)
			{
				students.remove(st);
				System.out.println("Removed..");
				return;
			}
		}	
		System.out.println("Sorry! No student registered.");
	}
}
