package factors_of_nyum;

import java.util.Scanner;

public class factors_of_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		System.out.println("Factors of number "+n+" are:");
		for(int i=1;i<=n;i++) {
			if (n%i==0) {
				System.out.print(i+" ");
			}
			
		}
	}

}
