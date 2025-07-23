package com.corso.poo.classes;

public class TshirtAbigliamento extends CapoAbigliamento {

	private int taglia;
	private int quantitaAcquistata;
	private int quantitaDisponibile;

	public TshirtAbigliamento(String marca, String modello, double costo, int taglia, int quantitaAcquistata,
			int quantitaDisponibile) {
		super(marca, modello, costo);
		this.taglia = taglia;
		this.quantitaAcquistata = quantitaAcquistata;
		this.quantitaDisponibile = quantitaDisponibile;
	}

}
