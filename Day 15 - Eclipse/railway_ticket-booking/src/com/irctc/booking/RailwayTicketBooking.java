package com.irctc.booking;

public class RailwayTicketBooking {

	
	public static void main(String[] args) {
		
		
		String customerName = args[0];
		String numberOfBookings = args[1];
		int ticketPrice = Integer.parseInt(args[2]);
		bookTicket(numberOfBookings , ticketPrice);
	}
	public  static boolean bookTicket(String numberOfBookings , int ticketPrice){
		boolean seatStatus = checkSeats(numberOfBookings);
		boolean paymentStatus = bookTicket(ticketPrice);
		return true;
		
		
	}
	public static boolean checkSeats(String numberOfBookings) {
		System.out.println("Checking Number of Seats Available");
			if(numberOfBookings.equals("OPEN")) {
				System.out.println("Booking your Seats");
				
				return true;
			} else {
				System.out.println("Sorry Seats not available, Try for Tatkal");
				return false;
			}	
		
	}
	public static boolean bookTicket(int ticketPrice) {
		System.out.println("Checking Payment Status");
			if(ticketPrice >= 1800) {
				System.out.println("Transaction completed");
				return true;
			}else {
				System.out.println("Transaction declined");
				return false;
			}
		
	} 
	
}
