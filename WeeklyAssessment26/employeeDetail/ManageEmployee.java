package employeeDetail;

//.Create an Employee class with
//1. Instance variables: empNo, name, age, location.
//2. A parameterized constructor to initialize them.
//Write a program using streams
//1. To add five Employee objects into an ArrayList,
//2. Filter the Employee objects whose location is Pune,
//3. Store them in a separate ArrayList and print their details

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ManageEmployee {

	public static void main(String args[])throws IOException {
		
		//Variables
		Integer empNo;
		String name;
		Integer age;
		String location;
		
		//List of employee
		List<Employee> listOfEmployee=new ArrayList<Employee>();
		
		//Taking input from user
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter employee 5 records:");
		for(int i=1;i<=5;i++) {
			System.out.println("Enter "+i+" employee detils :");
			System.out.print("Enter employee no. : ");
			empNo=Integer.parseInt(bufferedReader.readLine());
			System.out.print("Enter employee name : ");
			name=bufferedReader.readLine();
			System.out.print("Enter employee age : ");
			age=Integer.parseInt(bufferedReader.readLine());
			System.out.print("Enter employee location : ");
			location=bufferedReader.readLine();
			listOfEmployee.add(new Employee(empNo, name, age, location));
			
		}
		//filttering record using condition from list
		System.out.println("The details of employee whose location is pune ");
		List<Employee> puneEmployee=
				listOfEmployee.stream().filter(EmployeeLocation-> EmployeeLocation.getLocation().equalsIgnoreCase("Pune")).collect(Collectors.toList());
	    
		//Traversing listOfEmployee
		Iterator<Employee> iterator=puneEmployee.iterator();
		while(iterator.hasNext()) {
			Employee employee=iterator.next();
			System.out.println(employee.getEmpNo()+" "+employee.getName()+" "+employee.getAge()+" "+employee.getLocation());
		}
	}
}