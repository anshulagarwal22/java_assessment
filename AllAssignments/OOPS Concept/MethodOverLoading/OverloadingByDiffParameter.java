package September8.MethodOverLoading;

public class OverloadingByDiffParameter {
	//for employee
	void getEmploye(String Empname,int empid,String dept) {
		System.out.println("Name : "+Empname+"\nEmployee Id : "+empid+"\nEmployee Department : "+dept+"\n");
	}
	
	//For student 
	void getStudent(String stuname,int rollnum,String branch, String batch) {
		System.out.println("Student Name : "+stuname+"\nStudent Roll Number : "+rollnum+"\nBranch : "+branch+"%\nBatch : "+batch);
	}
	

	public static void main(String args[]) {
		OverloadingByDiffParameter overloadingWithDifferentParameter=new OverloadingByDiffParameter();
		overloadingWithDifferentParameter.getEmploye("Raju", 1001, "IT");
		overloadingWithDifferentParameter.getStudent("Shyam", 78, "CSE", "B");
		
	}
}