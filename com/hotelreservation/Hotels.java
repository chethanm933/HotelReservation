package com.hotelreservation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hotels {

	HashMap<String, List<Integer>> lakewood = new HashMap();
	HashMap<String, List<Integer>> bridgewood = new HashMap();
	HashMap<String, List<Integer>> ridgewood = new HashMap();
	
	public void setlakeWood() {
		List<Integer> lakewood = new ArrayList<>();
		lakewood.add(110);
		
		this.lakewood.put("Regular", lakewood);
	}
	
	public void setbridgeWood() {
		List<Integer> bridgewood= new ArrayList<>();
		bridgewood.add(160);
		
		this.bridgewood.put("Regular",bridgewood);
	}
	
	public void setridgewood() {
		List<Integer> ridgewood = new ArrayList<>();
		ridgewood.add(220);
	
		this.ridgewood.put("Regular",ridgewood);
	}
}
