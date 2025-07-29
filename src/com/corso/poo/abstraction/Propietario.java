package com.corso.poo.abstraction;

public class Propietario {

	String nome;
	String codiceF;
	String email;
	int eta;

	public Propietario() {
	}

	public Propietario(String nome, String codiceF, String email, int eta) {
		super();
		this.nome = nome;
		this.codiceF = codiceF;
		this.email = email;
		this.eta = eta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodiceF() {
		return codiceF;
	}

	public void setCodiceF(String codiceF) {
		this.codiceF = codiceF;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public void magiorenne(int eta) {
		if (eta >= 18) {
			System.out.println("Può avere il vehicolo");
			;
		} else {
			System.out.println("Deve essere maggiorenne per aver il veicolo");
		}

	}

}
