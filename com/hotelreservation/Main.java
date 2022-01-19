package com.hotelreservation;


public class Main {
	static MinCostHotel hotelCost = new MinCostHotel();
	static Hotels hotel = new Hotels();
	
	
	public static void main(String[] args) {
		
		String customerType = "Reward";
		String input =" 11sep2020(fri), 12sep2020(sat)";
		hotelCost.setHotels();
		int minHotel = hotelCost.minCostHotel(input, customerType);
		System.out.println(minHotel);
	}

}


