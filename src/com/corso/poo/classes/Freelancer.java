package com.corso.poo.classes;

public class Freelancer {
	public String nome;
	public String cognome;
	public int redditoAnnuoLordo;
	public int coeffRedd;
	public int tassaInps;
	public int tassaIrpef;

	// Contructor vuoto
	public Freelancer() {
		super();
	}

	// Constructor con paramatri
	public Freelancer(String nome, String cognome, int redditoAnnuoLordo, int coeffRedd, int tassaInps,
			int tassaIrpef) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.redditoAnnuoLordo = redditoAnnuoLordo;
		this.coeffRedd = coeffRedd;
		this.tassaInps = tassaInps;
		this.tassaIrpef = tassaIrpef;
	}

	// Metodi speciali della class

	public int getUtileTasse() {
		return redditoAnnuoLordo * coeffRedd / 100;
	}

	public int getTassaInps() {
		return getUtileTasse() * tassaInps / 100;
	}

	public int getTassaIrpef() {
		return getUtileTasse() * tassaIrpef / 100;
	}

	public int getRedditoAnnuoNetto() {
		return redditoAnnuoLordo - (getTassaInps() + getTassaIrpef()) / 12;
	}

}
