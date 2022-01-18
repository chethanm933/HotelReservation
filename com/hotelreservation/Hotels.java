package com.hotelreservation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hotels {

	HashMap<String, List<Integer>> lakewood = new HashMap();
	HashMap<String, List<Integer>> bridgewood = new HashMap();
	HashMap<String, List<Integer>> ridgewood = new HashMap();
	
	public static int lakewoodRating;
	public static int bridgewoodRating;
	public static int ridgewoodRating;
	
	
	public void setlakeWood() {
		List<Integer> lakewood = new ArrayList<>();
		lakewood.add(110);
		lakewood.add(90);
		
		this.lakewood.put("Regular", lakewood);
		
		lakewoodRating = 3;
	}
	
	public void setbridgeWood() {
		List<Integer> bridgewood= new ArrayList<>();
		bridgewood.add(160);
		bridgewood.add(50);
		
		this.bridgewood.put("Regular",bridgewood);
		
		bridgewoodRating = 4;
	}
	
	public void setridgewood() {
		List<Integer> ridgewood = new ArrayList<>();
		ridgewood.add(220);
		ridgewood.add(150);
	
		this.ridgewood.put("Regular",ridgewood);
		
		ridgewoodRating = 5;
	}
	
	public void setHotels() {
		setlakeWood();
		setbridgeWood();
		setridgewood();
	}
	
}