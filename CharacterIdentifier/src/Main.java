import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main

{

	public static  void identifyCharacter(char ch)
	
{
		boolean check=Character.isAlphabetic(ch);
		if (check) {
			Character []  c1= {'a','e','i','o','u'};
			Character []  c2= {'A','E','I','O','U'};
			if(Arrays.asList(c1).contains(ch)) {
				System.out.println(ch+" is Lower case vowel");	
			}
			else if(Arrays.asList(c2).contains(ch)) {
				System.out.println(ch+" is Upper case vowel");	
			}
			else if(Character.isLowerCase(ch)){
				System.out.println(ch+" is lower case consonant");
			}
			else {
				System.out.println(ch+" is Upper case consonant");
			}
		}
		else if(Character.isDigit(ch)) {
			System.out.println(ch+" is a number");
		}
		else {
			System.out.println(ch+" is special character");
		}

}

	public static void main(String[] args)

{
		Scanner scan=new Scanner(System.in);
		char b=scan.next().charAt(0);
		Character a=b;
		
		identifyCharacter(a);

}

}