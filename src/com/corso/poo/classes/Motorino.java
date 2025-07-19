package com.corso.poo.classes;

public class Motorino {

	public String colore;
	public float velocita;
	public String tipo;
	public boolean antifurto;

	public Motorino(String colore, float velocita, String tipo, boolean antifurto) {
		this.colore = colore;
		this.velocita = velocita;
		this.tipo = tipo;
		this.antifurto = antifurto;
	}

	public double getVelocita() {
		return velocita;
	}

	public void setVelocita(float velocita) {
		this.velocita = velocita;
	}

	public void accelera(float velocita) {
		if (antifurto == false) {
			this.velocita = velocita;
			System.out.println("Il motorino ha velocita: " + velocita);
		}
	}

	public void setAntifurto(boolean antifurto) {
		this.antifurto = antifurto;
		System.out.println("L'antifurto è inserito!");
	}

}
