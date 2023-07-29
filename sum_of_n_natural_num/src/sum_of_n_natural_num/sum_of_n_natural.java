package sum_of_n_natural_num;

import java.util.Scanner;

public class sum_of_n_natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		sum_n_method m=new sum_n_method();
		System.out.println(m.sum_num(n));
		
	}

}
