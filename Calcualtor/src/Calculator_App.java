import java.util.Scanner;

public class Calculator_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome to KodNest Calculator");
		System.out.println("+ ----------Addition");
		System.out.println("- ---------Subtraction");
		System.out.println("* ----------Multiplication");
		System.out.println("/ ----------Division");
		System.out.println("% ----------Remainder");
		System.out.println("^ ----------Power");
		System.out.println("Enter your choice");
		String k=s.nextLine();
		while(true) {
			Calculator c=new Calculator();
			switch(k) {
			
			case "+":
				System.out.println("Enter two number");
				
				System.out.println(c.add(s.nextInt(),s.nextInt()));
				break;
			case "-":
				System.out.println("Enter two number");
				
				System.out.println(c.sub(s.nextInt(),s.nextInt()));
				break;
			case "*":
				System.out.println("Enter two number");
				
				System.out.println(c.mul(s.nextInt(),s.nextInt()));
			case "/":
				System.out.println("Enter two number");
				
				System.out.println(c.div(s.nextInt(),s.nextInt()));
				break;
			case "%":
				System.out.println("Enter two number");
				
				System.out.println(c.rem(s.nextInt(),s.nextInt()));
				break;
			case "^":
				System.out.println("Enter two number");
				
				System.out.println(c.sqa(s.nextInt()));
				break;
			case "!":
				s.close();
				System.out.println("Thank you");
				return;
				
			default:
				System.out.println("Invalid input");
				break;
				
			}
			System.out.println("Welcome to KodNest Calculator");
			System.out.println("+ ----------Addition");
			System.out.println("- ---------Subtraction");
			System.out.println("* ----------Multiplication");
			System.out.println("/ ----------Division");
			System.out.println("% ----------Remainder");
			System.out.println("^ ----------Power");
			System.out.println("! ----------To stop");
			System.out.println("Enter your choice");
			s.nextLine();
			k=s.nextLine();
		}
		}
}
