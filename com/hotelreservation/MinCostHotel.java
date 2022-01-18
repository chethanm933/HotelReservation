package com.hotelreservation;
import java.util.List;

public class MinCostHotel {
	
	
	Hotels hotels = new Hotels();
	 
	public int minCostHotel(String input, String customerType) {
		
		int weekdays = 0;
		int weekends = 0;
		
		String[] arr = input.split(",");
		for (int i = 0; i < arr.length; i++) {
			String day = arr[i];
				if(day.contains("mon")||day.contains("tue")||day.contains("wed")||day.contains("thu")||day.contains("fri")) {
			weekdays++;
		} else {
			weekends++;
			}
		}
			
		List<Integer> lakewoodDetails = hotels.lakewood.get(customerType);
		int cost_of_lakewood = lakewoodDetails.get(0) * weekdays + lakewoodDetails.get(1) * weekends;
		
		List<Integer> bridgewoodDetails = hotels.bridgewood.get(customerType);
		int cost_of_bridgewood = bridgewoodDetails.get(0) * weekdays + bridgewoodDetails.get(1) * weekends;
		
		List<Integer> ridgewoodDetails =hotels.ridgewood.get(customerType);
		int cost_of_ridgewood = ridgewoodDetails.get(0) * weekdays + ridgewoodDetails.get(1) * weekends;
		
		return minCostBasedOnRting(cost_of_lakewood, cost_of_bridgewood, cost_of_ridgewood);
		}
	
		public int minCostBasedOnRting(int lakewood, int bridgewood, int ridgewood) {
			int minCost = 0;
			if(lakewood == bridgewood) {
				return hotels.bridgewoodRating > hotels.lakewoodRating ? bridgewood : lakewood;
			} else if(lakewood == ridgewood){
				return hotels.ridgewoodRating > hotels.lakewoodRating ? lakewood : ridgewood;
			} else if(bridgewood == ridgewood) {
				return hotels.ridgewoodRating > hotels.bridgewoodRating ? ridgewood : bridgewood;
			} else {
			minCost = Math.min(lakewood, Math.min(bridgewood, ridgewood));
			}
			return minCost;
			
		}
	}

