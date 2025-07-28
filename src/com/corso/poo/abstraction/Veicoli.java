package com.corso.poo.abstraction;

public abstract class Veicoli {

	public String targa;
	public String colore;
	public int annoInmatricolazion;
	Propietario propVeicolo;

	public Veicoli() {
	}

	public Veicoli(String targa, String colore, int annoInmatricolazion, Propietario propVeicolo) {
		super();
		this.targa = targa;
		this.colore = colore;
		this.annoInmatricolazion = annoInmatricolazion;
		this.propVeicolo = propVeicolo;
	}

	public abstract void run();

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public int getAnnoInmatricolazion() {
		return annoInmatricolazion;
	}

	public void setAnnoInmatricolazion(int annoInmatricolazion) {
		this.annoInmatricolazion = annoInmatricolazion;
	}

	public Propietario getPropVeicolo() {
		return propVeicolo;
	}

	public void setPropVeicolo(Propietario propVeicolo) {
		this.propVeicolo = propVeicolo;
	}

}
