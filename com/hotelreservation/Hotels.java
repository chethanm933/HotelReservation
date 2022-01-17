package com.hotelreservation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hotels {
	
	private ReservationSystem hotels = new ReservationSystem();
	
	public void lakeWood() {
		List<Integer> lakewood = new ArrayList<>();
		lakewood.add(110);
		
		hotels.hotelReservationSystem.add(lakewood);
	}
	
	public void bridgeWood() {
		List<Integer> bridgewood= new ArrayList<>();
		bridgewood.add(160);
		
		hotels.hotelReservationSystem.add(bridgewood);
	}
	
	public void ridgewood() {
		List<Integer> ridgewood = new ArrayList<>();
		ridgewood.add(220);
		
		hotels.hotelReservationSystem.add(ridgewood);
	}
	
	
	
	
}