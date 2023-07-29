package com.e_wallet;
import java.util.*;
public class e_wallet_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to the E_wallet_App.\n\nFor logging in please enter:");
		System.out.print("User_name: ");
		String user=scan.nextLine();
		System.out.print("Password: ");
		String pass=scan.nextLine();
		e_wallet e=new e_wallet();
		if (e.login(user, pass)=="yes"){
			System.out.println("Select the option\nDeposit:Enter 1//  Purchase:Enter 2//  Recharge:Enter 3//  Check_Balance:Enter 4");
			int select=scan.nextInt();
			int con=select;
			while (true) {
			switch(con) {
			case 1:
				System.out.println("Please put the amount to be deposited");
				int amount=scan.nextInt();
				String result1=e.deposit(amount);
				System.out.println("\n"+result1);
				System.out.println("Enter 5 to log out\n   or   \n1/2/3/4 to continue");
				con=scan.nextInt();
				break;
			
			case 2:
				System.out.println("Please fill the following");
				System.out.print("Enter the name of product: ");
				scan.nextLine();
				String name=scan.nextLine();
				System.out.println("Enter the cost: ");
				int cost =scan.nextInt();
				String result2=e.purchase(name,cost);
				System.out.println("\n"+result2);
				System.out.println("Enter 5 to log out\n   or   \n1/2/3/4 to continue");
				con=scan.nextInt();
				break;
			case 3:
				System.out.print("Please enter brand of phone: ");
				scan.nextLine();
				String name1=scan.nextLine();
				System.out.print("enter phone number: ");
				long phone=scan.nextLong();
				System.out.println("Enter cost: ");
				int cost1 =scan.nextInt();
				String result3=e.recharge(name1,phone,cost1);
				System.out.println("\n"+result3);
				System.out.println("Enter 5 to log out\n   or   \n1/2/3/4 to continue");
				con=scan.nextInt();
				break;
			case 4:
				
				String result4=e.check_bal();
				System.out.println("\n"+result4);
				System.out.println("Enter 5 to log out\n   or   \n1/2/3/4 to continue");
				con=scan.nextInt();
				break;
			default:
				System.out.println("Sorry you entered are out of service");
				con=5;
				break;
			}
			if(con==5) {
				System.out.println("Thank you");
				System.out.println("You have logged out");
				break;
			}
			}
		
		}
		else {
			System.out.println(e.login(user, pass));
		}

	}

}
