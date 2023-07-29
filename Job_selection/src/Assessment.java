import java.util.Scanner;

public class Assessment {
	Scanner scan=new Scanner(System.in);
	int marks=0;
	public Assessment() {
		System.out.println("Assessment");
	}
	public void start() {
		System.out.println("Let's start your Assessment");
	}
	public void add() {
		System.out.println("What is the sum of 23 and 27 ?");
		int ans=scan.nextInt();
		if (ans==50) {
			marks+=5;
			System.out.println("Right Answer");
		}
		else {
			System.out.println("Wrong Answer");
		}
	
	}
	public void sub() {
		System.out.println("What is the subtraction of 147 and 127 ?");
		int ans=scan.nextInt();
		if (ans==20) {
			marks+=5;
			System.out.println("Right Answer");
		}
		else {
			System.out.println("Wrong Answer");
		}
	
	}
	public void mul() {
		System.out.println("What is the multiplication of 20 and 5 ?");
		int ans=scan.nextInt();
		if (ans==100) {
			marks+=5;
			System.out.println("Right Answer");
		}
		else {
			System.out.println("Wrong Answer");
		}
	
	}
	public void div() {
		System.out.println("What is the division of 70 with 7 ?");
		int ans=scan.nextInt();
		if (ans==10) {
			marks+=5;
			System.out.println("Right Answer");
		}
		else {
			System.out.println("Wrong Answer");
		}
	
	}
	public void squa() {
		System.out.println("What is the square of 11 ?");
		int ans=scan.nextInt();
		if (ans==121) {
			marks+=5;
			System.out.println("Right Answer");
		}
		else {
			System.out.println("Wrong Answer");
		}
	
	}
	public String eligibility() {
		if (marks>=10) {
			System.out.println("You have got "+marks);
			return "yes";
		}
		else {
			System.out.println("You have failed this assessmet.");
			return "no";
		}
	}

}
