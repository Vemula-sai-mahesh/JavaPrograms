package sum_of_n_natural_num;

import java.util.Scanner;

public class sum_n_method {

	public int sum_num(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}

}
