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
		
		hotelsreservation.lakewood.put("Regular", lakewoodRegular);
	}
	
	public void bridgeWood() {
		List<Integer> bridgeWoodRegular = new ArrayList<>();
		bridgeWoodRegular.add(160);
		bridgeWoodRegular.add(60);
		
		hotelsreservation.bridgewood.put("Regualr", bridgeWoodRegular);
		
	}
	
	public void ridgewood() {
		List<Integer> ridgewoodRegular = new ArrayList<>();
		ridgewoodRegular.add(220);
		ridgewoodRegular.add(150);
		
		hotelsreservation.ridgewood.put("Regular", ridgewoodRegular);
	}
	
	
	
	
}