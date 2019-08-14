package edu.eci.arsw.math;


public class piThread extends Thread{
	
	private int inicio;
	private int fin;
	private byte[] rta;

	public piThread(int inicio, int fin) {
		this.inicio = inicio;
		this.fin = fin;
	}
	
	public void calcular() {
		rta = PiDigits.getDigits(inicio, fin);
	}
	
	public void run() {
		calcular();
	}
}
