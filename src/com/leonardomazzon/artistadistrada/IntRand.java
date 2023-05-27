package com.leonardomazzon.artistadistrada;

/**
 * Questa classe ti consente di generare casualmente un intero
 * @author Leonardo Mazzon 4CIA
 * @version 2.0
 */
public class IntRand {
	
	/**
	 * Genera casualmente un intero random
	 * @param min Minimo intero generato 
	 * @param max Massimo intero generato
	 * @return Numero random compreso tra il minimo e il massimo
	 */
	public static int getRandInt(int min, int max) {
		return (int) (min+(max-min+1)*Math.random());
	}

}

