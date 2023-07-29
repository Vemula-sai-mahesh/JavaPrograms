import java.util.Scanner;

public class DiscountApplicable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the cash:");
		Scanner scan=new Scanner(System.in);
		DiscountApplicable.Applicable(scan.nextInt());
		scan.close();
	}
	public static void Applicable( int cash)
	{
		if (cash>=100) {
			System.out.println("Discount Applicable");
		}
		else {
			System.out.println("Sorry Discount not-Applicable");
		}
	}
}
