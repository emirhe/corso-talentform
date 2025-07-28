package com.corso.poo.debug;

public class Debug {

	public int somma(int a, int b) {
		return a + b;
	}

	public int divisione(int c, int d) {
		return c / d;
	}

	public static void main(String[] args) {

		Debug debug = new Debug();
		int a = 2;
		int b = 4;
		int c = 12;
		int d = 2;

		System.out.println(debug.somma(a, b));
		System.out.println(debug.divisione(c, d));

	}

}
