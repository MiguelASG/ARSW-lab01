package edu.eci.arsw.primefinder;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//PrimeFinderThread pft=new PrimeFinderThread(0, 30000000);
		//pft.start();
		PrimeFinderThread hilo1 = new PrimeFinderThread(0, 10000000);
		PrimeFinderThread hilo2 = new PrimeFinderThread(10000001, 20000000);
		PrimeFinderThread hilo3 = new PrimeFinderThread(20000001, 30000000);
		int i=0;
		long tiempoini = System.currentTimeMillis();
		long tiempofin;
		while(true) {
			tiempofin = System.currentTimeMillis();
			if(tiempofin-tiempoini>=5000) {
				break;
			}
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
		while(!(in.equals(""))) {
			in = br.readLine();
		}
		hilo1.resume();
		hilo2.resume();
		hilo3.resume();
	}
	
}
