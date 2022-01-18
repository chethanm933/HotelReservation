package com.hotelreservation;


public class Main {
	static MinCostHotel hotelCost = new MinCostHotel();
	static Hotels hotel = new Hotels();
	
	
	public static void main(String[] args) {
		
		String input ="Regular, 11spe2020(mon), 12sep2020(tue)";
		hotel.setHotels();
		int minHotel = hotelCost.minCostHotel(input);
		System.out.println(minHotel);
	}

}


