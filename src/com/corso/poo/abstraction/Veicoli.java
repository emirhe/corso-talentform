package com.corso.poo.abstraction;

public abstract class Veicoli {

	public String tipologia;
	public String modelo;
	public String marchio;
	public String targa;
	public String colore;
	public int annoInmatricolazion;
	Propietario propVeicolo;

	public Veicoli() {
	}

	public Veicoli(String tipologia, String modelo, String marchio, String targa, String colore,
			int annoInmatricolazion, Propietario propVeicolo) {
		this.tipologia = tipologia;
		this.modelo = modelo;
		this.marchio = marchio;
		this.targa = targa;
		this.colore = colore;
		this.annoInmatricolazion = annoInmatricolazion;
		this.propVeicolo = new Propietario();
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

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarchio() {
		return marchio;
	}

	public void setMarchio(String marchio) {
		this.marchio = marchio;
	}

}
