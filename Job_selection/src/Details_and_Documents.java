import java.util.Scanner;

public class Details_and_Documents extends Assessment{
	Scanner scan=new Scanner(System.in);
	String name;
	String email;
	long phone_no;
	String pan_id;
	int final_per;
	boolean check;
	String checky;
	public Details_and_Documents(int a) {
		super();
		System.out.println("Details and Documents submission:"+a);
	}
	public void detail() {
		System.out.println("Enter your name:");
		name=scan.nextLine();
		System.out.println("Enter your email:");
		email=scan.nextLine();
		System.out.println("Enter your phone_no:");
		phone_no=scan.nextLong();
		scan.nextLine();
		System.out.println("Enter your pan_id:");
		pan_id=scan.nextLine();
		System.out.println("Enter your final_per:");
		final_per=scan.nextInt();
		scan.nextLine();
	}
	public boolean check_bool(){
		String quit;
		while (check==false) {
			System.out.println("Do you agree for terms and conditions of this company.\n Enter:yes/no");
			checky=scan.nextLine();
			if (checky.equals("yes")) {
				check=true;
			}
			else if(checky.equals("no")) {
				System.out.println("We cannot go further on your application without agreeing for terms.");
				System.out.println("Do you want to quit the for this job.\n Enter:yes/no");
				quit=scan.nextLine();
				if(quit.equals("yes")) {
					System.out.println("You are quitted this job.");
					return check;
				}
				else if(quit.equals("no")){
					continue;
				}
			}
			else {
				System.out.println("Invalid inpiut");
				System.out.println("We cannot go further on your application without agreeing for terms.");
				System.out.println("Do you want to quit the for this job.\n Enter:yes/no");
				quit=scan.nextLine();
				if(quit.equals("yes")) {
					System.out.println("You are quitted this job.");
					return check;
				}
				else if(quit.equals("no")){
					continue;
				}
			}
		}
		return check;
	}

}
