import java.util.Scanner;

public class Main {

	public static void checkMutlipleOfTen( int n, int i) {
		if (n%i==0) {
			System.out.println(n+" is mutiple of "+i);
		}
		else {
			System.out.println(n+" is not mutiple of "+i);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		checkMutlipleOfTen(scan.nextInt(),scan.nextInt());
		scan.close();

	}

}
