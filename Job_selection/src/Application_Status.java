import java.util.Scanner;

public class Application_Status {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Hello, we are happy to inform that, you got short listed for \nFull stack Web development role. ");
		System.out.println("Here are the stages of selection:");
		Offer_letter o1=new Offer_letter();
		System.out.println("Are you ready to begin your Assessment:\n Enter:yes/no");
		String ready=s.nextLine();
		if (ready.equals("yes")) {
			o1.start();
			o1.add();
			o1.sub();
			o1.mul();
			o1.div();
			o1.squa();
			String eligible=o1.eligibility();
			if (eligible.equals("yes")) {
				o1.detail();
				boolean check=o1.check_bool();
				if(check==true) {
					o1.review_app();
					System.out.println("Name: "+o1.name);
					System.out.println("email id: "+o1.email);
					System.out.println("Phone no: "+o1.phone_no);
					System.out.println("Pan id: "+o1.pan_id);
					System.out.println("Highest graduation percentage in number: "+o1.final_per);
					System.out.println("Your marks in assessment: "+o1.marks);
					System.out.println();
					System.out.println("Dear "+o1.name+",");
					o1.offer();
				}
				else {
					System.out.println("Better luck next time");
					System.out.println("Thank you.");
				}
			}
			else {
				System.out.println("Better luck next time");
				System.out.println("Thank you.");
			}
		}
		else if(ready.equals("no")){
			System.out.println("It seems you are not prepared.");
			System.out.println("Come to the test later.\n All the best.");
			s.close();
			return;
		}
		else {
			System.out.println("Invalid input");
			System.out.println("Again run the application");
			s.close();
			return;	
		}
		s.close();
		
	}

}
