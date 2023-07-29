
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Printnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		ArrayList<Integer> arr1=Printnumbers.numbers2(n);
		ArrayList<Integer> arr2=Printnumbers.numbers3(n);
		ArrayList<Integer> arr3=Printnumbers.numbers5(n);
		ArrayList<Integer> arr4=Printnumbers.numbers2and5(n);
		ArrayList<Integer> arr5=Printnumbers.numbers3and5(n);
		ArrayList<Integer> arr6=Printnumbers.numbersprime(n);
	    List<ArrayList<Integer>> arr = Arrays.asList(arr1,arr2,arr3,arr4,arr5,arr6);
	    List<String> arrs = Arrays.asList("Numers divible by 2:","Numers divible by 3:","Numers divible by 5:","Numers divible by 3 and 5:","Numers divible by 2 and 5:","Prime Numbers:");
	    for (int i=0;i<arr.size();i++) {
	    	System.out.println(arrs.get(i));
	    	for (int j=0;j<(arr.get(i).size());j++) {
	    		System.out.print(arr.get(i).get(j)+" ");
	    	}
	    	System.out.println();
	    	System.out.println();
	    }


	}
	public static ArrayList<Integer> numbers2(int n) {
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for (int i=0;i<n;i++) {
			if (i%2==0) {
				arr.add(i);
			}
		}
		return arr;
	}
public static ArrayList<Integer> numbers3(int n) {
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for (int i=1;i<n;i++) {
			if (i%3==0) {
				arr.add(i);
			}
		}
		return arr;
	}
public static ArrayList<Integer> numbers5(int n) {
	
	ArrayList<Integer> arr=new ArrayList<Integer>();
	for (int i=1;i<n;i++) {
		if (i%5==0) {
			arr.add(i);
		}
	}
	return arr;
}
public static ArrayList<Integer> numbers2and5(int n) {
	
	ArrayList<Integer> arr=new ArrayList<Integer>();
	for (int i=1;i<n;i++) {
		if (i%2==0 && i%5==0) {
			arr.add(i);
		}
	}
	return arr;
}
public static ArrayList<Integer> numbers3and5(int n) {
	
	ArrayList<Integer> arr=new ArrayList<Integer>();
	for (int i=1;i<n;i++) {
		if (i%3==0 && i%5==0) {
			arr.add(i);
		}
	}
	return arr;
}
public static ArrayList<Integer> numbersprime(int n) {
	
	ArrayList<Integer> arr=new ArrayList<Integer>();
	for (int i=2;i<n;i++) {
		int x=0;
		for (int j=2;j<i;j++) {
			if (i%j==0) {
				x=1;
				break;	
			}
		}
		if(x==0) {
			arr.add(i);
		}
	}
	return arr;
}


}
