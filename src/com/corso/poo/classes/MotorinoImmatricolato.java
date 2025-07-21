package com.corso.poo.classes;

public class MotorinoImmatricolato extends Motorino {

	private float maxVelocita; // km/h max che puo raggiungere
	private String targa;

	public MotorinoImmatricolato(String colore, float velocita, String tipo, boolean antifurto, float maxVelocita,
			String targa) {
		super(colore, velocita, tipo, antifurto);
		this.maxVelocita = maxVelocita;
		this.targa = targa;
	}

	public float getMax() {
		return maxVelocita;
	}

	@Override
	public void accelera(float velocita) {
		float s = getVelocita() + velocita;
		if (s < maxVelocita) {
			setVelocita(s);
		} else {
			setVelocita(maxVelocita);
			;
		}
	}

}
