package September8.ConsOverLoading;

public class OverloadingByDiffParameter {
	
	//For Employee
	OverloadingByDiffParameter(String Empname,int empid,String dept) {
		System.out.println("Name : "+Empname+"\nEmployee Id : "+empid+"\nEmployee Department : "+dept+"\n");
	}

	//For Student
	OverloadingByDiffParameter(String stuname,int rollnum,String branch, String batch) {
		System.out.println("Student Name : "+stuname+"\nStudent Roll Number : "+rollnum+"\nBranch : "+branch+"%\nBatch : "+batch);
	}
	

	public static void main(String args[]) {
		OverloadingByDiffParameter a=new OverloadingByDiffParameter("Raju", 1001, "IT");
		OverloadingByDiffParameter b=new OverloadingByDiffParameter("Shyam", 78, "CSE", "B");
	}
}