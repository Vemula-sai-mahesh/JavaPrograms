import java.util.Scanner;

public class Main

{

public static void checkDiscount(double purchaseAmount)

{ // your code here
	if(purchaseAmount>100) {
		System.out.println("Disount Applicable for "+purchaseAmount);
	}
	else {
		System.out.println("No Disount Applicable for "+purchaseAmount);
	}

}

public static void main(String[] args)

{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter purchased amount:");
	double n=scan.nextDouble();
	Main.checkDiscount(n);
	scan.close();
}

}