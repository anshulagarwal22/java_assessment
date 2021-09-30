package September8.MethodOverLoading;

public class OverloadingByChangeSequence {
	
	//for employee 
	void getEmployee(String Empname,int empid,String branch) {
		System.out.println("Name : "+Empname+"\nEmployee Id : "+empid+"\nEmployee Branch : "+branch+"\n");
	}
	
	//After changing the Sequence
	void getEmployee(int empid,String branch,String Empname) {
		System.out.println("Name : "+Empname+"\nEmployee Id : "+empid+"\nEmployee Branch : "+branch+"\n");
	}

	public static void main(String args[]) {
		OverloadingByChangeSequence overloadingByChangingSeq=new OverloadingByChangeSequence();
		overloadingByChangingSeq.getEmployee("Raju", 1001, "IT");
		
		//object second method
		OverloadingByChangeSequence overloadingByChangingSeq1=new OverloadingByChangeSequence();
		overloadingByChangingSeq1.getEmployee(101, "Account","Ram");
		
		
	}

}