package com.navi.upi;

public class Upi {

	public static void main(String[] args) {
		Account account = new Account(100, "Sarvagay");
		
		System.out.println("Account Name: Sarvagay Sanmotra");
		
		account.transferMoney(50);
		System.out.println("Account Balance after transferring: "+ account.checkBalance());
		
		account.recieveMoney(20);
		System.out.println("Account Balance after recieving: "+"Rs."+account.checkBalance());
	}
}
