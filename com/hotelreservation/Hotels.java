package com.hotelreservation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hotels {

	HashMap<String, List<Integer>> lakewoodList = new HashMap();
	HashMap<String, List<Integer>> bridgewoodList = new HashMap();
	HashMap<String, List<Integer>> ridgewoodList = new HashMap();
	
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

		this.lakewoodList.put("Regular", lakewoodRegular);
		this.lakewoodList.put("Reward", lakeReward);
		
		
		lakewoodRating = 3;
	}
	
	public void setbridgeWood() {
		List<Integer> bridgewood= new ArrayList<>();
		bridgewood.add(160);
		bridgewood.add(50);
		
		List<Integer> bridgeReward = new ArrayList<>();
		bridgeReward.add(110);
		bridgeReward.add(50);
		
		this.bridgewoodList.put("Regular",bridgewood);
		this.bridgewoodList.put("Reward", bridgeReward);
		
		bridgewoodRating = 4;
	}
	
	public void setridgewood() {
		List<Integer> ridgewood = new ArrayList<>();
		ridgewood.add(220);
		ridgewood.add(150);
		
		List<Integer> ridgeReward = new ArrayList<>();
		ridgeReward.add(100);
		ridgeReward.add(40);
		
		
		this.ridgewoodList.put("Regular",ridgewood);
		this.ridgewoodList.put("Reward", ridgeReward);
		
		System.out.println();
		
		ridgewoodRating = 5;
	}
	
	
}