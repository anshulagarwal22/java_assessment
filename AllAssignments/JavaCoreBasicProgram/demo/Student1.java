package com.demo;


//Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively
//by creating two objects of class 'Student'.

class StudentI{
	String name;
	int rollno;
    long phoneno;
	String address;
	void studentinfo(String n,int roll,long phone,String add) {
		name=n;
		rollno=roll;
		phoneno=phone;
		address=add;
		
		
		System.out.println("Name : "+name+"\n RollNo. : "+rollno+"\n MobileNo : "+phoneno+"\n Address : "+address);
	}
	
}
public class Student1 {
	public static void main(String args[]) {
		
		StudentI student=new StudentI ();
		StudentI student1=new StudentI();
		// for student Sam
		student.studentinfo("Sam",1,7434832382L,"delhi");
		// for student John
		
		student1.studentinfo("John",2,9743633632L,"mumbai");
	}

}





