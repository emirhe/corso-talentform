package com.corso.poo.classes;

public class Cellulare {

	private double carica;
	private int numChiamate;

	public Cellulare(double carica, int numChiamate) {
		this.carica = carica;
		this.numChiamate = numChiamate;
	}

	public void ricarica(double ricarica) {
		carica += ricarica;
	}

	public void chiama(double minDurata) {
		carica -= (minDurata * 0.20);
	}

	public double numero404() {
		return carica;
	}

	public void azzeraChiamata() {
		numChiamate = 0;
	}

}
