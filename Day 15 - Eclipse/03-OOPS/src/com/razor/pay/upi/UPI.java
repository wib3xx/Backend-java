package com.razor.pay.upi;

public class UPI {

	public static void main(String[] args) {
		
		Account account = new Account(1000, "Sarvagay_Sanmotra");
		
		System.out.println("Available Balance = Rs."+ account.checkBalance());
		
		account.transferMoney(500);
		System.out.println("Available Balance after Transfer = Rs."+ account.checkBalance());
		
		account.recieveMoney(200);
		System.out.println("Available Balance after Recieving = Rs."+ account.checkBalance());
	}
	
}
