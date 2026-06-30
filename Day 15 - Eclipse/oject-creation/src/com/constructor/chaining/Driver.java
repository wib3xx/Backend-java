package com.constructor.chaining;

class paymentSystems extends Object{
	public paymentSystems(String status) {
		super();
	}
	
}

class Payment extends paymentSystems{
	public Payment(){
		super("initialized");
	}	
}

class UPIPayments extends Payment{
	public UPIPayments() {
		super();
	}
	
}

public class Driver {

	public static void main(String[] args) {
		
		
	}
}
