package com.corso.poo.debug;

public class DebugBucles {

	public static void main(String[] args) {

		int fattoreTabellina = 1;
		int prodotto = 0;

		for (int i = 1; i <= 5; i++) {
			prodotto = i * fattoreTabellina;
			System.out.println(fattoreTabellina + " x " + i + " = " + prodotto);
		}

	}

}
