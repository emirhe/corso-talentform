package com.corso.math.date;

public class EserciziMath {

	public static void main(String[] args) {
		// Radici quadrata - sqrt
		System.out.println("radice quadrata di 64 = " + Math.sqrt(64));
		System.out.println("radice quadrata di 125 = " + Math.sqrt(125));

		System.out.println("-----------------------");

		// Potencias - Pow
		System.out.println("3 alla terza = " + Math.pow(3, 3));
		System.out.println("4 alla terza = " + Math.pow(4, 3));

		System.out.println("-----------------------");

		// round
		System.out.println("arrotondamento superiore = " + Math.round(7.6));
		System.out.println("arrotondamento inferiore = " + Math.round(7.4));

		System.out.println("-----------------------");

		// floor
		System.out.println("mantiene il primo numero intero inferiore = " + Math.floor(5.9));

		System.out.println("-----------------------");

		// ceil
		System.out.println("arrottonda al interero superiore = " + Math.ceil(9.6));

		System.out.println("-----------------------");

		// ciclo for utilizzando random

		for (int i = 2; i < 13; i++) {
			int numRandom = (int) (Math.random() * i + 1);
			System.out.print(numRandom + "-");
		}

		System.out.println("");
		System.out.println("-----------------------");

		// Calcola 2 elevato alla 5 utilizzando Math.pow.

		int resultato = (int) Math.pow(2, 5);
		System.out.println("2 elevato alla 5: " + resultato);

		System.out.println("-----------------------");

		// Trova la radice quadrata di 49.
		int numRadice = 49;
		System.out.println("radice quadrata di " + numRadice + " è : " + Math.sqrt(numRadice));

		System.out.println("-----------------------");

		// Arrotonda il numero 3.6.

		double quantita = 6.5;
		System.out.println("arrotondamento del numero: " + quantita + " è: " + Math.round(quantita));

		System.out.println("-----------------------");

		// Stampa il maggiore tra 15 e 27.
		int g = 15;
		int h = 27;
		System.out.println("il numero maggiore è: " + Math.max(g, h));

		System.out.println("-----------------------");

		// Stampa il minore tra 23 e 12

		int c = 23;
		int d = 12;
		System.out.println("il numero minore è: " + Math.min(c, d));

		// Stampa un numero casuale (double) tra 0.0 e 1.0.
		System.out.println("numero casuale tra 0.0 e 1.0: " + Math.random());

		System.out.println("-----------------------");

		// Stampa un numero intero random compreso tra 1 e 10.
		int numRandom = (int) (Math.random() * 10) + 1;
		System.out.println(numRandom);

		// v2
		System.out.println("v2 - random");
		int numMax = 10;
		int numMin = 1;
		int numRandom2 = (int) (Math.random() * (numMax - numMin + 1) + numMin);
		System.out.println(numRandom2);

		System.out.println("-----------------------");

		// Stampa la differenza assoluta tra 20 e 35.
		int e = 20;
		int f = 35;
		int diff = Math.abs(e - f);
		System.out.println(diff);

		// Dati i cateti a = 3 e b = 4, calcola l’ipotenusa usando il teorema di
		// Pitagora.

		System.out.println("-----------------------");
		// c² = a² + b²
		double a = 3;
		double b = 4;
		double ipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

		System.out.println("il valore della ipotenusa è: " + ipotenusa);

		System.out.println("-----------------------");

		// genera un numero casuale intero tra 1 e 6
		int numMax2 = 6;
		int numMin2 = 1;
		int numCasual = (int) (Math.random() * (numMax2 - numMin2 + 1) + numMin2);
		System.out.println(numCasual);

		System.out.println("-----------------------");

		// genera un numero casuale intero tra 1 e 6
		// Dato il raggio r = 5, calcola l’area del cerchio.

		double r = 5;
		double areaCirculo = Math.PI * Math.pow(r, 2);
		System.out.println("l'area del circulo con r = " + r + " è " + areaCirculo);

		System.out.println("-----------------------");

		// Stampa un numero casuale compreso tra 0.00 e 1.00 con due cifre decimali.
		double numberRandom = (Math.random() * 100 / 100.0);
		double redCifra = Math.round(numberRandom);
		System.out.println(redCifra);

	}

}
