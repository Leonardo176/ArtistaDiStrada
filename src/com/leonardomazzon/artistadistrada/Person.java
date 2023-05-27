package com.leonardomazzon.artistadistrada;

public class Person extends Thread {
	private Data data;
	
	public Person(Data d) {
		data = d;
	}
	
	public void run() {
		long timeUsed = 0;		//time used when trying to obtain a chair
		long timeGen;
		boolean done = false;	//when the painting has been done
		
		while(!done && timeUsed <= data.maxTime) {
			timeGen = IntRand.getRandInt(1000, 10000);
			
			try {
				//waste some time
				Thread.sleep(timeGen);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			timeUsed = timeUsed + timeGen;
			
			//try to obtain a chair;
			
			if(data.chairs.tryLock()) {
				
				//try to do the painting
				
				data.artist.lock();
				
				//unlock one chair
				
				data.chairs.unlock();
				
				//the artist take some time to do the painting
				try {
					Thread.sleep(IntRand.getRandInt(1000, 10000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				done = true;
				
				//unlock the artist
				data.artist.unlock();
				
				System.out.println("The artist has painted the person called: "+this.getName());
			}
		}
	}
}
