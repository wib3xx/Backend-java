package com.supr.money.upi;

public class User {

	public static void main(String[] args) {
		Account account = new Account(100, "Sarvagay");
		
		System.out.println("Available Balance: "+ "Rs."+ account.checkBalance());
		
		account.transferAmount(10);
		System.out.println("Available Balance after Transfer: "+"Rs."+account.checkBalance() );
		
		account.recieveAmount(20);
		System.out.println("Available Balance after Recieving Amount: "+"Rs."+account.checkBalance() );
		
	}
	
}
