package com.corso.inheritance.polymorphism;

public class Prodotto {

	private String tipoProdotto;
	private String idProdotto;
	private String nomeProdotto;

	public Prodotto() {
	}

	public Prodotto(String tipoProdotto, String idProdotto, String nomeProdotto) {
		super();
		this.tipoProdotto = tipoProdotto;
		this.idProdotto = idProdotto;
		this.nomeProdotto = nomeProdotto;
	}

	public String getTipoProdotto() {
		return tipoProdotto;
	}

	public void setTipoProdotto(String tipoProdotto) {
		this.tipoProdotto = tipoProdotto;
	}

	public String getIdProdotto() {
		return idProdotto;
	}

	public void setIdProdotto(String idProdotto) {
		this.idProdotto = idProdotto;
	}

	public String getNomeProdotto() {
		return nomeProdotto;
	}

	public void setNomeProdotto(String nomeProdotto) {
		this.nomeProdotto = nomeProdotto;
	}

}
