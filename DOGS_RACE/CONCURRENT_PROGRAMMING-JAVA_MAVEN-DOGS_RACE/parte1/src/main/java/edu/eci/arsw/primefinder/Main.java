package edu.eci.arsw.primefinder;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		//PrimeFinderThread pft=new PrimeFinderThread(0, 30000000);
		//pft.start();
		PrimeFinderThread hilo1 = new PrimeFinderThread(0, 10000000);
		PrimeFinderThread hilo2 = new PrimeFinderThread(10000001, 20000000);
		PrimeFinderThread hilo3 = new PrimeFinderThread(20000001, 30000000);
		int i=0;
		while(System.currentTimeMillis()!=5000) {
			
			if(i==0) {
				hilo1.start();
				hilo2.start();
				hilo3.start();
				i=1;
			}
		}
		hilo1.suspend();
		hilo2.suspend();
		hilo3.suspend();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		while(!(in.equals("\n"))) {
			String in = br.readLine();
		}
	}
	
}
