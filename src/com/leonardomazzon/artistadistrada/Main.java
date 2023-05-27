package com.leonardomazzon.artistadistrada;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i, nPerson, maxTime;
		Scanner kbd = new Scanner(System.in);
		Person[] people;
		Data data;
		
		System.out.print("Number of people: ");
		nPerson = kbd.nextInt();
		
		System.out.print("Maximum time for the people to wait the artist (in ms): ");
		maxTime = kbd.nextInt();
		
		kbd.close();
		
		people = new Person[nPerson];
		data = new Data(maxTime);
		
		for(i = 0; i < nPerson; i++) {
			people[i] = new Person(data);
			people[i].setName("Person-"+(i+1));
			people[i].start();
		}
		
		for(i = 0; i < nPerson; i++) {
			try {
				people[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
