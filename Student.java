package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName()
	{
		System.out.println("Bharathy");
	}
	
	public void studentDept()
	{
		System.out.println("Computer Science");
	}
	
	public void studentId()
	{
		System.out.println("12132565");
	}
	
	
	public static void main(String[] args) {
		
		
		Student st =new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.DeptName();st.studentDept();
		st.studentId();
		st.studentName();

	}

}
