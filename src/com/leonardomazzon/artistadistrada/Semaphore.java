package com.leonardomazzon.artistadistrada;

public class Semaphore {
	private int s;
	
	public Semaphore(int n) {
		s = n;
	}
	
	/**
	 * Try to lock the semaphore, if it fails it doesn't block the thread
	 * @return the result of the lock operation, true if the semaphore can be locked, false otherwise
	 */
	synchronized public boolean tryLock() {
		boolean res = false;
		
		//if the semaphore can be locked
		if(s > 0) {
			lock();
			res = true;
		}
		
		return res;
	}
	
	synchronized public void lock() {
		s--;
		
		if(s < 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	synchronized public void unlock() {
		s++;
		this.notify();
	}
}
