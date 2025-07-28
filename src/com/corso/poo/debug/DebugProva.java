package com.corso.poo.debug;

public class DebugProva {

	public static void main(String[] args) {

		System.out.println("Inizio del programma");

		int a = 5;
		int b = 3;

		int resultato = sumar(a, b); // Qui va un breakpoint

		System.out.println("Risoltato: " + resultato);

		System.out.println("Programma finalizzato");

	}

	public static int sumar(int x, int y) {
		int suma = x + y;
		return suma;
	}

}
