package com.hotelreservation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hotels {
	
	private ReservationSystem hotelsreservation = new ReservationSystem();
	
	public void lakeWood() {
		List<Integer> lakewoodRegular = new ArrayList<>();
		lakewoodRegular.add(110);
		lakewoodRegular.add(90);
		
		List<Integer> lakewoodReward = new ArrayList<>();
		lakewoodReward.add(80);
		lakewoodReward.add(80);
		
		hotelsreservation.lakewood.put("Regular", lakewoodRegular);
		hotelsreservation.lakewood.put("Reward", lakewoodReward);
		hotelsreservation.lakewoodRating =3;
		
	}
	
	public void bridgeWood() {
		List<Integer> bridgeWoodRegular = new ArrayList<>();
		bridgeWoodRegular.add(160);
		bridgeWoodRegular.add(60);
		
		List<Integer> bridgewoodReward = new ArrayList<>();
		bridgewoodReward.add(110);
		bridgewoodReward.add(50);
		
		hotelsreservation.bridgewood.put("Regualr", bridgeWoodRegular);
		hotelsreservation.bridgewood.put("Reward", bridgewoodReward);
		hotelsreservation.bridgewoodRating =4;
	}
	
	public void ridgewood() {
		List<Integer> ridgewoodRegular = new ArrayList<>();
		ridgewoodRegular.add(220);
		ridgewoodRegular.add(150);
		
		List<Integer> ridgewoodReward = new ArrayList<>();
		ridgewoodReward.add(100);
		ridgewoodReward.add(40);
		
		hotelsreservation.ridgewood.put("Reward", ridgewoodReward);
		hotelsreservation.ridgewood.put("Regular", ridgewoodRegular);
		hotelsreservation.ridgewoodRating = 5;	
	}
	
	
	
	
}