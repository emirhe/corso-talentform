package com.corso.inheritance.polymorphism;

public class Laptop extends Prodotto {

	private String modelo;
	private int annoProduzione;

	public Laptop() {

	}

	public Laptop(String modelo, int annoProduzione) {
		super();
		this.modelo = modelo;
		this.annoProduzione = annoProduzione;
	}

	public Laptop(String tipoProdotto, String idProdotto, String nomeProdotto) {
		super(tipoProdotto, idProdotto, nomeProdotto);
		// TODO Auto-generated constructor stub
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnnoProduzione() {
		return annoProduzione;
	}

	public void setAnnoProduzione(int annoProduzione) {
		this.annoProduzione = annoProduzione;
	}

}
