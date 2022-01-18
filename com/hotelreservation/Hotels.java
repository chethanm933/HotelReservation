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
		List<Integer> lakewoodRegular = new ArrayList<>();
		lakewoodRegular.add(110);
		lakewoodRegular.add(90);
		
		
		List<Integer> lakeReward = new ArrayList<>();
		lakeReward.add(80);
		lakeReward.add(80);

		this.lakewood.put("Regular", lakewoodRegular);
		this.lakewood.put("Reward", lakeReward);
		
		
		lakewoodRating = 3;
	}
	
	public void setbridgeWood() {
		List<Integer> bridgewood= new ArrayList<>();
		bridgewood.add(160);
		bridgewood.add(50);
		
		List<Integer> bridgeReward = new ArrayList<>();
		bridgeReward.add(110);
		bridgeReward.add(50);
		
		this.bridgewood.put("Regular",bridgewood);
		this.bridgewood.put("Reward", bridgeReward);
		
		bridgewoodRating = 4;
	}
	
	public void setridgewood() {
		List<Integer> ridgewood = new ArrayList<>();
		ridgewood.add(220);
		ridgewood.add(150);
		
		List<Integer> ridgeReward = new ArrayList<>();
		ridgeReward.add(100);
		ridgeReward.add(40);
		
		this.ridgewood.put("Regular",ridgewood);
		this.ridgewood.put("Reward", ridgeReward);
		
		ridgewoodRating = 5;
	}
	
	public void setHotels() {
		setlakeWood();
		setbridgeWood();
		setridgewood();
	}
	
}