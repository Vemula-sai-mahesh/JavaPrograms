package factorial_num;

import java.util.Scanner;

public class factorial_num {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		int fac=1;
		for(int i=1;i<=n;i++) {
			fac*=i;
		}
		System.out.println("Factorial of "+n+" is "+fac );
	}
}
