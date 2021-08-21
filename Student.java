package org.student;

import org.department.Department;

public class Student extends Department {
	
		public void studentName()
		{
			System.out.println("Student Name:Saranya");
		}
		public void studentDept()
		{
			System.out.println("Student Dept:B.E");
		}
		public void studentId()
		{
			System.out.println("Student ID:6213");
		}
		public static void main(String[] args) {
			
			Department dept= new Department();
			System.out.println("**** Department Class****");
			dept.collegeCode();
			dept.collegeName();
			dept.collegeRank();
			dept.deptName();
			
			System.out.println("**** Student Class****");		
			Student stud=new Student();
			stud.collegeCode();
			stud.collegeName();
			stud.collegeRank();
			stud.deptName();
			stud.studentName();
			stud.studentDept();
			stud.studentId();
		}
	}


