package com.hotelreservation;
import java.util.List;

public class MinCostHotel {
	
	
	Hotels hotels = new Hotels();
	
	public void setHotels() {
		hotels.setlakeWood();
		hotels.setbridgeWood();
		hotels.setridgewood();
	}
	 
	public int minCostHotel(String input) {
		
		String[] arr = input.split(",");
		int day = arr.length-1;
		String customerType = arr[0];
		System.out.println(customerType);
			
		List<Integer> lakewoodDetails = hotels.lakewood.get(customerType);
		int cost_of_lakewood = lakewoodDetails.get(0) * day;
		
		List<Integer> bridgewoodDetails = hotels.bridgewood.get(customerType);
		int cost_of_bridgewood = bridgewoodDetails.get(0) * day;
		
		List<Integer> ridgewoodDetails =hotels.ridgewood.get(customerType);
		int cost_of_ridgewood = ridgewoodDetails.get(0) * day;
		
		int minCost = Math.min(cost_of_lakewood, Math.min(cost_of_bridgewood, cost_of_ridgewood));
		
		return minCost;
		
		
	}

	
	

}
