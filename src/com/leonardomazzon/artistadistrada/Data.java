package com.leonardomazzon.artistadistrada;

public class Data {
	public Semaphore artist;	//mutex semaphore for painting one person at a time
	public Semaphore chairs;	//counting semaphore for the people that are waiting on the chairs
	public final long maxTime;	//max time for the people to get a painting from the artist
	
	/**
	 * Constructor of class Data
	 * @param maxTime maximum time that a person can use to obtain a chair in ms
	 */
	public Data(long maxTime) {
		this.maxTime = maxTime;
		artist = new Semaphore(1);
		chairs = new Semaphore(4);
	}
}
