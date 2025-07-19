package com.corso.array;

public class EserciziArray {

	public static void main(String[] args) {

		// Dichiarazione array
		int[] arrayNumeri = new int[7];

		// Inizializazione
		arrayNumeri[0] = 5;
		arrayNumeri[1] = 8;
		arrayNumeri[2] = 10;
		arrayNumeri[3] = 2;
		arrayNumeri[4] = 9;
		arrayNumeri[5] = 6;
		arrayNumeri[6] = 1;

		System.out.println("----- Visualizzacione con for: -----");
		for (int i = 0; i < arrayNumeri.length; i++) {
			System.out.println("Posizione: " + i + "- contenuto: " + arrayNumeri[i]);
		}

		System.out.println("----- Visualizzacione con for each: -----");
		// con for each
		for (int indice : arrayNumeri) {
			System.out.println("Contenuto: " + indice);
		}

		System.out.println("---------------------");
		// Dichiarazione e inizializazione, tutto insieme
		int[] arrayNum = { 50, 20, 75, 88, 92, 100 };
		// for each
		for (int i : arrayNum) {
			System.out.print(i + "/");
		}

		System.out.println("");
		System.out.println("---------------------");
		// Array Strings
		String[] arrayStrings = new String[5];
		arrayStrings[0] = "Mexico";
		arrayStrings[1] = "Italia";
		arrayStrings[2] = "España";
		arrayStrings[3] = "Portugal";
		arrayStrings[4] = "Ecuador";

		for (int i = 0; i < arrayStrings.length; i++) {
			System.out.println(i + ": " + arrayStrings[i]);
		}

		System.out.println("---------------------");
		// Calcola la somma di tutti gli elementi di un array.

		// Calcola la media aritmetica degli elementi di un array.

		int[] num = { 2, 10, 5, 10, 8, 25 };
		double somma = 0;
		for (int i = 0; i < num.length; i++) {
			somma = somma + num[i];
		}
		System.out.println("somma array: " + somma + " / la media: " + somma / num.length);

		System.out.println("---------------------");
		// Trova il valore massimo e minimo in un array di interi.
		int max = num[0];
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
			if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("il massimo del array: " + max + " / " + "il minimo del array: " + min);

		System.out.println("---------------------");
		// Conta il numero di elementi pari in un array.

		int cont = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				cont++;
			}
		}
		System.out.println("elementi pari dentro l'array: " + cont);

		System.out.println("---------------------");

		// Stampa gli elementi dell’array in ordine inverso.
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i] + "-");
		}

		System.out.println("");
		System.out.println("---------------------");
		// Controlla se un numero dato (es. 10) è presente nell’array.
		// Conta quanti elementi nell’array sono maggiori di 10.

		boolean essiste = false;
		int numU = 10;
		int presenti = 0;
		int conta = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == numU) {
				essiste = true;
				presenti++;
			}
			if (num[i] > numU) {
				conta++;
			}
		}
		System.out.println("nel array c'e un 10?: " + essiste + " /quanti ci sono?: " + presenti);
		System.out.println("quanti numeri maggiori di 10 ci sono?: " + conta);

		System.out.println("---------------------------");
		// Copia tutti gli elementi di un array in un secondo array e stampalo.
		int[] arrayEmp = new int[arrayNum.length];
		for (int i = 0; i < arrayNum.length; i++) {
			arrayEmp[i] = arrayNum[i];
		}
		for (int i = 0; i < arrayEmp.length; i++) {
			System.out.println(arrayEmp[i]);
		}

		System.out.println("-----------------");
		// leggere e stampare gli elementi di un array
		int[] listN = { 6, 8, 4, 3, 7, 1, 2 };
		for (int i : listN) {
			System.out.print(i + " - ");
		}
		// somma degli elementi array
		int sommaList = 0;
		for (int i = 0; i < listN.length; i++) {
			sommaList += listN[i];
		}
		System.out.println("/ la somma del array è: " + sommaList);

		// Calcola la media aritmetica degli elementi di un array.
		double sommaMedia = 0;
		for (int i = 0; i < listN.length; i++) {
			sommaMedia += listN[i];
		}
		double media = sommaMedia / listN.length;
		System.out.println("la media del array: " + media);

		System.out.println("-----------------");
		// Dato un array, calcola la differenza tra il valore massimo e minimo.

		int numeroMax = listN[0];
		int numeroMin = listN[0];

		for (int i = 0; i < listN.length; i++) {
			if (listN[i] > numeroMax) {
				numeroMax = listN[i];
			}
			if (listN[i] < numeroMin) {
				numeroMin = listN[i];
			}
		}
		int diferenzaNum = numeroMax - numeroMin;
		System.out.println("la differenza tra valori Max e Min del array è: " + diferenzaNum);

		System.out.println("-----------------");
		// Scrivi un programma che trova la posizione del numero 9 nell’array.

		int[] listaAr = { 2, 3, 9, 4, 6 };
		int numCer = 9;
		for (int i = 0; i < listaAr.length; i++) {
			if (listaAr[i] == numCer) {
				System.out.println("la posizione del num 9 è: " + i);
			}
		}

		// Stampa solo gli elementi dispari presenti in un array.

		for (int i = 0; i < listaAr.length; i++) {
			if (listaAr[i] % 2 != 0) {
				System.out.print(listaAr[i] + "/");
			}
		}

		System.out.println("");
		System.out.println("---------");
		// Controlla se gli elementi dell’array sono ordinati in ordine crescente.
		boolean crescente = true;
		for (int i = 0; i < listaAr.length - 1; i++) {
			if (listaAr[i] > listaAr[i + 1]) {
				crescente = false;
				break;
			}
		}
		System.out.println("l'array è ordinato?: " + crescente);

		System.out.println("-------------------");
		// Calcola la somma dei numeri pari e quella dei numeri dispari separatamente.

		int[] newLista = { 7, 9, -2, 8, 20, -25, -1 };
		int sommaPari = 0;
		int sommaDispari = 0;

		for (int i = 0; i < newLista.length; i++) {
			if (newLista[i] % 2 == 0) {
				sommaPari += newLista[i];
			} else {
				sommaDispari += newLista[i];
			}
		}
		System.out.println("la somma dei numeri pari è: " + sommaPari);
		System.out.println("la somma dei numeri dispari è: " + sommaDispari);

		System.out.println("-------------------");
		// Dato un array, crea un nuovo array con solo i numeri positivi.

		int[] originali = { -2, 4, -1, 3, 0, 7 };
		int conts = 0;
		for (int i : originali) {
			if (i > 0) {
				conts++;
			}
		}

		int j = 0;
		int[] arrayPositivo = new int[conts];
		for (int i = 0; i < originali.length; i++) {
			if (originali[i] > 0) {
				arrayPositivo[j] = originali[i];
				j++;
			}
		}

		for (int i = 0; i < arrayPositivo.length; i++) {
			System.out.print(arrayPositivo[i] + "/");
		}

	}

}
