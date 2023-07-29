import java.util.Scanner;

public class AgeCategorizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Age:");
		AgeCategorizer.Categorizer(scan.nextInt());
	}
	public static void Categorizer(int age) {
		if (0<=age && age<=12) {
			System.out.println("Child");
		}
		else if(13<=age && age<=19) {
			System.out.println("Teen");
		}
		else if(20<=age &&age<=59) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior");
		}
		
	}

}
