import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
	static ArrayList<Integer> arr=new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=scan.nextInt();
		System.out.println("Enter "+size+" numbers line by line to enter into an array");
		int i=0;
		while(i<size) {
			int n=scan.nextInt();
			ArrayList1.arradd(Integer.valueOf(n));
			i++;
		}
		System.out.println("your array list:");
		System.out.println(arr);
		System.out.println("Enter the index of number want to print");
		int j=scan.nextInt();
		get(j);
		System.out.println("Enter first index and last index of subList you want");
		subList(scan.nextInt(), scan.nextInt());
		System.out.println("Program finished");
		scan.close();
	}
	public static ArrayList<Integer> arradd(Integer n) {
		arr.add(n);
		return arr;
	}
	public static void get(int i) {
		System.out.println(arr.get(i));
	}
	public static void subList(int i,int j) {
		System.out.println(arr.subList(i, j));
	}

}
