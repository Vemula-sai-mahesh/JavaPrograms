package whether_prime;

import java.util.Scanner;

public class prime_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		int x=0;
//		for(int i=2;i<n;i++) {
//			if(n%i==0) {
//				System.out.println(n+" is not prime");
//				x=1;
//				break;
//			}
//		}
//		
//		if(x==0) {
//			System.out.println(n+" is prime");
//		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println(n+" is not prime");
				return;
			}
		}
		System.out.println(n+" is prime");
		
		
	}

}
