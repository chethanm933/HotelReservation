package com.hotelreservation;

public class Hotels {

	String hotel_name;
	int weekday_rate;
	int weekend_rate;
	int rating;

	
	
	public Hotels(String hotel_name, int weekday_rate, int weekend_rate, int rating) {
		super();
		this.hotel_name = hotel_name;
		this.weekday_rate = weekday_rate;
		this.weekend_rate = weekend_rate;
		this.rating = rating;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public int getWeekday_rate() {
		return weekday_rate;
	}

	public void setWeekday_rate(int weekday_rate) {
		this.weekday_rate = weekday_rate;
	}

	public int getWeekend_rate() {
		return weekend_rate;
	}

	public void setWeekend_rate(int weekend_rate) {
		this.weekend_rate = weekend_rate;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
