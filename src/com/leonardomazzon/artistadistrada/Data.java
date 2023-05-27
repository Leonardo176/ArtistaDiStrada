package com.leonardomazzon.artistadistrada;

public class Data {
	public Semaphore artist;
	public Semaphore chairs;
	public final long maxTime;	//in ms
	
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
