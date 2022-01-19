package com.hotelreservation;
import java.util.List;

public class MinCostHotel {
	
	ReservationSystem reservationsystem  = new ReservationSystem();
	Hotels hotels = new Hotels();
	
	public void setHotels() {
		hotels.setlakeWood();
		hotels.setbridgeWood();
		hotels.setridgewood();
	}
	
	public String minCostHotel(String input) {
		String[] arr = input.split(",");
		String customerType = "";
		if(arr.length > 0) {
			String[] temp = arr[0].split(":");
			customerType = temp[0];
			arr[0] = temp[1];
		}
			String hotel = minCostHotel(customerType,  arr);
			return hotel;
	}

	private String minCostHotel(String customerType, String[] arr) {
	
		int noOfWeekDays = 0;
		int noOfWeekEnds =0;
		int lakeWoodCost = 0;
		int bridgeWoodCost = 0;
		int ridgeWoodCost = 0;
		
		for (int i = 0; i < arr.length; i++) {
			String day = arr[i];
			if(day.contains("mon")|| day.contains("tue")|| day.contains("wed")|| day.contains("thu")|| day.contains("fri")) {
				noOfWeekDays++;
			} else {
				noOfWeekEnds++;
			}
		}
		
		List<Integer> valueForLakeWood = reservationsystem.lakewood.get(customerType);
		List<Integer> valueForBridgeWood = reservationsystem.bridgewood.get(customerType);
		List<Integer> valueForRidgeWood = reservationsystem.ridgewood.get(customerType);
		
		lakeWoodCost = noOfWeekDays*valueForLakeWood.get(0) + noOfWeekEnds * valueForLakeWood.get(1);
		bridgeWoodCost = noOfWeekDays*valueForBridgeWood.get(0) + noOfWeekEnds * valueForBridgeWood.get(1);
		ridgeWoodCost = noOfWeekDays*valueForRidgeWood.get(0) + noOfWeekEnds * valueForRidgeWood.get(1);
	
		String hotel = calcualateMinHotel(lakeWoodCost, bridgeWoodCost, ridgeWoodCost);
		System.out.println("Lakewood Hotel Cost :"+lakeWoodCost+"Bridgewood Hotel Cost :"+bridgeWoodCost+ "Ridgewood Hotel Cost" +ridgeWoodCost);
		return hotel;
	}

	private String calcualateMinHotel(int lakeWoodCost, int bridgeWoodCost, int ridgeWoodCost) {
		int minCost = Math.min(lakeWoodCost, Math.min(ridgeWoodCost, bridgeWoodCost));
		if(minCost == lakeWoodCost && minCost == bridgeWoodCost) {
			return ReservationSystem.bridgewoodRating > ReservationSystem.lakewoodRating ? "BridgeWood" : "LakeWood";
		} else if (minCost == bridgeWoodCost && minCost == ridgeWoodCost) {
			return ReservationSystem.bridgewoodRating > ridgeWoodCost ? "BridgeWood" : "RidgeWood";
		} else if (minCost == ridgeWoodCost && minCost == lakeWoodCost) {
			return lakeWoodCost > ridgeWoodCost ? "LakeWood" : "RidgeWood";
		} else {
            if (minCost == lakeWoodCost) {
                return "LakeWood";
            } else if (minCost == bridgeWoodCost) {
                return "BridgeWood";
            } else {
                return "RidgeWood";
            }
	}
	
		
	}
}
