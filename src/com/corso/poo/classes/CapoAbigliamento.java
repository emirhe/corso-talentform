package com.corso.poo.classes;

public class CapoAbigliamento {
	public String marca;
	public String modello;
	public double costo;

	public CapoAbigliamento(String marca, String modello, double costo) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.costo = costo;
	}

	public double getCosto() {
		return costo;
	}

	public double aplicaSconto(double sconto) {
		return costo - (costo * sconto / 100);
	}

	public void modificaCosto(double costoNuovo) {
		this.costo = costoNuovo;
	}

	@Override
	public String toString() {
		return "CapoAbigliamento [marca=" + marca + ", modello=" + modello + ", costo=" + costo + "]";
	}

}
