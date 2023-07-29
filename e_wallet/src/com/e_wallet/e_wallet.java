package com.e_wallet;

public class e_wallet {
	int bal;
	public  String login(String user,String pass) {
		if (user.equals("Prasanna")) {
			if(pass.equals("Prasanna")) {
				return "yes";
			}
			else {
				return "wrong password";
			}
		}
		else {
			return "invalid username";
		}
	}
	public String deposit(int amount) {
		bal=bal+amount;
		return amount+" Amount is added to your account";
	}
	public String purchase(String name,int cost) {
		if(bal>cost) {
		bal=bal-cost;
		return name+" is purchased for "+cost;
		}
		else {
			return "You don't have sufficient balance to buy "+name;
		}
	}
	public String recharge(String name,long phone,int cost) {
		if(bal>cost) {
		bal=bal-cost;
		return name+"phone is recharged with "+cost;
		}
		else {
			return "You don't have sufficient balance to recharge "+name+" phone with "+cost;
		}
	}
	public String check_bal() {
		return "Total balance in your account is "+bal;
	}
	
}
