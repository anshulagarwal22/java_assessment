package com.demo;
////Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
//Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.



class StudentD{
	String getName(String name) {
		return name;
	}
	int getRollNumber(int rollno) {
		return rollno;
	}
}
public class Student {
	public static void main(String args[]) {
		StudentD student=new StudentD();
		StudentD student1=new StudentD();
		
		String name=student.getName("John");
		System.out.println("Student name is : "+name);
	
	    
	    int rollno=student1.getRollNumber(2);
	    System.out.println("Student roll no. is : "+rollno);
	    
	    
	}
	
}










