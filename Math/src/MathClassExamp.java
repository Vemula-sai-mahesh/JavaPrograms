import java.util.Scanner;

public class MathClassExamp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		System.out.println("Enter the power:");
		int i=scan.nextInt();
		pow(n,i);
		System.out.println("Enter the number to do squareroot of it");
		sqrt(scan.nextDouble());
	}

	public static void pow(int n,int i) {
		System.out.println(n+" power "+i+" is "+(int)Math.pow(n,i));
	}
	public static void sqrt(double n) {
		System.out.println((int)n+" squareroot  is "+(int)Math.sqrt(n));
	}
	
}
