package com.leonardomazzon.artistadistrada;

public class Data {
	public Semaphore artist;
	public Semaphore chairs;
	public final int maxTime;	//in ms
	
	/**
	 * Constructor of class Data
	 * @param maxTime maximum time that a person can use to obtain a chair in ms
	 */
	public Data(int maxTime) {
		this.maxTime = maxTime;
		artist = new Semaphore(1);
		chairs = new Semaphore(4);
	}
}
