package com.strings.day2;

public class Driver {

	public static void main(String[] args) {
		
		String city = "Banglore";               //Object will rely SCP 
		city = city.concat(", India");			//India is in SCP but resulted new object will be in heap
		
		System.out.println(city);
	}
}
