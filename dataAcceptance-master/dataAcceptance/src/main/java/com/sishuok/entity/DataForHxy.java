package com.sishuok.entity;

public class DataForHxy {

	String mmsi;
	double lat;
	double lon;
	int    time_utc;
	
	
	public String getMmsi() {
		return mmsi;
	}
	public void setMmsi(String mmsi) {
		this.mmsi = mmsi;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public int getTime_utc() {
		return time_utc;
	}
	public void setTime_utc(int time_utc) {
		this.time_utc = time_utc;
	}
}
