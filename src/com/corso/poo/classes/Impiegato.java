package com.corso.poo.classes;

public class Impiegato {

	public String matricola;
	public double stipendio;
	public double straordinario;

	public Impiegato(String matricola, double stipendio, double straordinario) {
		this.matricola = matricola;
		this.stipendio = stipendio;
		this.straordinario = straordinario;
	}

	public double getStipendio() {
		return stipendio;
	}

	public double totaleExtraordinario(double costoOraStraordinario) {
		return stipendio + (straordinario * costoOraStraordinario);
	}

	public void stampa() {
		System.out.println(matricola + " / " + stipendio + " / " + straordinario);
	}

}
