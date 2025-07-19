package com.corso.estruttureloop;

public class EserciziDoWhile {

	public static void main(String[] args) {
		/*
		 * Scrivi un programma che stampa la tabellina del 5 da 1×5 a 10×5. Scrivi un
		 * programma che stampa i numeri pari da 2 a 20 usando do-while. Scrivi un
		 * programma che conta quante cifre ha un numero intero positivo, ad esempio n =
		 * 12345 ha 5 cifre.
		 */

		int numTabella = 5;
		int numMoltiplicatore = 1;
		do {
			int prodotto = numTabella * numMoltiplicatore;
			System.out.println(numMoltiplicatore + "x" + numTabella + "=" + prodotto);
			numMoltiplicatore++;
		} while (numMoltiplicatore <= 10);

		System.out.println("---------------------");

		int numPari = 2;
		do {
			System.out.print(numPari + "-");
			numPari += 2;
		} while (numPari <= 20);

		System.out.println("");
		System.out.println("---------------------");

		int n = 12354;
		int cifra = 0;
		do {
			n /= 10;
			cifra++;
		} while (n > 0);
		System.out.println("Il numero ha: " + cifra + " cifre");

		System.out.println("---------------------");
		/*
		 * Scrivi un programma che calcola base^esponente usando do-while. Esempio: 3^4
		 * = 81
		 */

		int base = 3;
		int esponente = 4;
		int risultato = 1;
		int cont = 1;

		do {
			risultato *= base;
			cont++;
		} while (cont <= esponente);
		System.out.println(base + "^" + esponente + " = " + risultato);

		System.out.println("---------------------");
		/*
		 * Scrivi un programma che somma tutte le cifre di un numero intero positivo.
		 * Esempio: 456 → 4 + 5 + 6 = 15.
		 */

		int numero = 456;
		int somma = 0;

		do {
			int cifraNum = numero % 10;
			somma = somma + cifraNum;
			numero = numero / 10;
		} while (numero > 0);
		System.out.println(somma);
		System.out.println("---------------------");

	}

}
