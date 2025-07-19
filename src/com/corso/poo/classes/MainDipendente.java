package com.corso.poo.classes;

public class MainDipendente {

	public static void main(String[] args) {

		Dipendente dipendenteI = new Dipendente(160, 10);

		System.out.println("Totale stipendio mensile: €" + dipendenteI.getStipendio());
		System.out.println("Totale ore mensili lavorate: " + dipendenteI.getOreLavorate());
		System.out.println("Retribuzione oraria: €" + dipendenteI.getRetribuzioneOraria());
	}

}
