package com.strings.day2;

public class Driver2 {

	public static void main(String[] args) {
		String employeeFirstName = "Sarvagay";     //Stored in SCP
		String employeeSecondName = employeeFirstName.concat(" Sanmotra");
		
		System.out.println(employeeSecondName);
		
		String companyFirstName = new String("Infosys");   //Stored in SCP as well as Heap 
		String companySecondName = new String(" Ltd");
		
		System.out.println("Company Name: "+ companyFirstName + companySecondName);
		
		//System.out.println(companyFirstName == companySecondName);
	}
}
