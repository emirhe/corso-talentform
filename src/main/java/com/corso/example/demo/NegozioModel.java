package com.corso.example.demo;

import java.util.List;

public class NegozioModel {

	private int id;
	private String tipologia;
	private List<String> caratteristiche;
	private double prezzo;
	private int quantita;
	private String brand;

	public NegozioModel(int id, String tipologia, List<String> caratteristiche, double prezzo, int quantita,
			String brand) {
		this.id = id;
		this.tipologia = tipologia;
		this.caratteristiche = caratteristiche;
		this.prezzo = prezzo;
		this.quantita = quantita;
		this.brand = brand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public List<String> getCaratteristiche() {
		return caratteristiche;
	}

	public void setCaratteristiche(List<String> caratteristiche) {
		this.caratteristiche = caratteristiche;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
