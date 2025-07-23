package com.corso.poo.classes;

public class CalcolaStipendio {

	public static void main(String[] args) {

		DipendenteA emir = new DipendenteA("58568E", 1500, 8.5);

		emir.prendiMalattia(5);

		System.out.println("Il totale della paga: " + emir.paga(3));
		emir.stampaMalattia();

		emir.prendiMalattia(1);
		emir.stampaMalattia();

	}

}
