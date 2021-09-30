package Constructors;

public class Grader {
	
	String score;
	int percentage;
	
	//constructor
	Grader(String name, int Maths, int Science, int English, int SocialStudy) {
		
		int sum = Science + Maths + English + SocialStudy;
		percentage= (sum*100)/400;
		
		System.out.println("Name: " + name+ "\nPercentage " + percentage);
	}
	
	//score in grade
	void Grade() {
		
		if(percentage>0 && percentage<100) {
			if(percentage>90) {
				score = "Grade A=";
				System.out.println(score);
			}
			else if(percentage>80 && percentage<=90) {
				score = "Grade A";
				System.out.println(score);
			}
			else if(percentage>70 && percentage<=80) {
				score = "Grade B";
				System.out.println(score);
			}
			else if(percentage>60 && percentage<=70) {
				score = "Grade C";
				System.out.println(score);
			}
			else if(percentage>50 && percentage<=60) {
				score = "Grade D";
				System.out.println(score);
			}
			else if(percentage>33 && percentage<=50) {
				score = "Grade E";
				System.out.println(score);
			}
			else {
				score ="Grade ";
				System.out.println(score);
			}
		}
		
		else {
			System.out.println("Score is not invalid");
		}
		System.out.println();
	}
	


}