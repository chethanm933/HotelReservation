package com.hotelreservation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReservationSystem {

	static List<Hotels> reservationsys = new ArrayList<>();
	
	public static void main(String[] args) {
		
		ReservationSystem reservation = new ReservationSystem();
		
		reservation.addHotels();
		
		
	}
	
	public void addHotels() {
		
		Hotels hotel1 = new Hotels("Lakewood",110,80,3);
		Hotels hotel2 = new Hotels("Bridgewood",160,110,4);
		Hotels hotel3 = new Hotels("Rridgewood",220,100,4);
		
		reservationsys.add(hotel1);
		reservationsys.add(hotel2);
		reservationsys.add(hotel3);
		System.out.println("Hotels added Successfully");
	}
	
}
