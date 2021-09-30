package September8.ConsOverLoading;

public class OverloadingByChangeSequence {
	
	//for employee 
	OverloadingByChangeSequence(String Empname,int empid,String branch) {
		System.out.println("Name : "+Empname+"\nEmployee Id : "+empid+"\nEmployee Branch : "+branch+"\n");
	}
	
	//After changing the Sequence
	OverloadingByChangeSequence(int empid,String branch,String Empname) {
		System.out.println("Name : "+Empname+"\nEmployee Id : "+empid+"\nEmployee Branch : "+branch+"\n");
	}
	
	//Main method
	public static void main(String args[]) {
		OverloadingByChangeSequence a1=new OverloadingByChangeSequence("Raju", 1001, "IT");
		OverloadingByChangeSequence  a2=new OverloadingByChangeSequence(101, "Account","Ram");
	}

}