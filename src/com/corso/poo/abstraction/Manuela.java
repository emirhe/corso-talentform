package com.corso.poo.abstraction;

public class Manuela extends Propietario {

	public Manuela(String nome, String codiceF, String email, int eta) {
		super(nome, codiceF, email, eta);
	}

	@Override
	public void maggioreEta() {
		if (eta >= 18) {
			System.out.println("Maggiore età");
		} else {
			System.out.println("Non può guidare");
		}
	}

}
