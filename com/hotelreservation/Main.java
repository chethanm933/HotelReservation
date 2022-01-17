package com.hotelreservation;

public class Main {
	static MinCostHotel hotel = new MinCostHotel();

	public static void main(String[] args) {
		
		String input ="Regular: 11spe2020(mon), 12sep2020(tue)";
		System.out.println(hotel.minCostHotel(input));
	}

}
