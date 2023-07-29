package kodnest_assesments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Assesment_4 {
	static int age=30;
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list=Arrays.asList(20,2,3,5,4,3,4,53,5,35,6,46,746,3,5,755,78,100);
		Set<Integer> s=new LinkedHashSet<>();
		s.addAll(list);
		System.out.println(s);
		


	}

}
