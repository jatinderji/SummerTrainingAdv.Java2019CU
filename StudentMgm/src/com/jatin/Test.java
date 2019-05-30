package com.jatin;

import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int rollno,c= 1;
		String name,course;
		StudentManage std= new StudentManage();
		while(c!=5)
		{
			System.out.println("Press 1 to Register Student");
			System.out.println("Press 2 to Search Student");
			System.out.println("Press 3 to Show Students");
			System.out.println("Press 4 to Remove Student");
			System.out.println("Press 5 to Exit");
			System.out.print("Enter your choice: ");
			c = sc.nextInt();
			switch(c)
			{
				case 1:
					System.out.print("Enter rollno: ");
					rollno = sc.nextInt();
					System.out.print("Enter name: ");
					name = sc.next();
					System.out.print("Enter course: ");
					course = sc.next();
					std.registerStudent(rollno, name, course);
					break;
				case 2:
					System.out.print("Enter rollno: ");
					rollno = sc.nextInt();
					std.search(rollno);
					break;
				case 3:
					std.showStudents();
					break;
				case 4:
					System.out.print("Enter rollno: ");
					rollno = sc.nextInt();
					std.removeStd(rollno);
					break;
				case 5:
					System.out.print("Thanks for using.. b bye");
					break;
				default:
					System.out.println("Invalid Choice.");
					break;
			}
		}
		
		sc.close();
	}
}
