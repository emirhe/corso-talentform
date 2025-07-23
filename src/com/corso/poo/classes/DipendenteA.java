package com.corso.poo.classes;

public class DipendenteA extends Impiegato {

	private int malattia = 0;

	public DipendenteA(String matricola, double stipendio, double straordinario) {
		super(matricola, stipendio, straordinario);
	}

	public void prendiMalattia(int giorniMalattia) {
		this.malattia += giorniMalattia;
	}

	@Override
	public double paga(double costoOraStraordinario) {
		double p = super.paga(costoOraStraordinario);
		if (malattia == 0) {
			return p;
		}
		return p - malattia * 15.0;
	}

	public void stampaMalattia() {
		System.out.println(malattia);
	}

}
