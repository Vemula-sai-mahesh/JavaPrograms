import java.util.Scanner;

public class PylogonIdentifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter no. of sides:");
		PylogonIdentifier.Identifier(scan.nextInt());
	}
	public static void Identifier(int sides) {
		if (sides<=2) {
			System.out.println("Cannot make a polygon");
		}
		else {
		switch(sides) {
		
		case 3:
			System.out.println("Triangle");
			break;
		case 4:
			System.out.println("Quadrilateral");
			break;
		case 5:
			System.out.println("Pentagon");
			break;
		case 6:
			System.out.println("Hexagon");
			break;
		case 7:
			System.out.println("Septagon");
			break;
		case 8:
			System.out.println("Octagon");
			break;
		default:
			System.out.println("Polygon");
		}
		}
	}

}
