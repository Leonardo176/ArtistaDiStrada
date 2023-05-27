package com.leonardomazzon.artistadistrada;

/**
 * This class allows you to generate randomy an Integer
 * @author Leonardo Mazzon 4CIA
 * @version 2.0
 */
public class IntRand {
	
	/**
	 * Generate randomly an integer
	 * @param min Minimum integer generated
	 * @param max Maximum integer generated
	 * @return Random number between min and max
	 */
	public static int getRandInt(int min, int max) {
		return (int) (min+(max-min+1)*Math.random());
	}

}

