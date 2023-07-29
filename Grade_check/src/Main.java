import java.util.Scanner;

public class Main {

	public static void checkGrade(int grade)

	{ // your code here
		if (grade>50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

	public static void main(String[] args)

	{
		Scanner scan=new Scanner(System.in);
		int grade=scan.nextInt();
		checkGrade(grade);
		scan.close();
	}

	
}
