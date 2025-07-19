package com.corso.array;

import java.util.Scanner;

public class EserciseArrayMore {

	public static void main(String[] args) {
		// Calcola la media degli numeri di un array
		/*
		 * Scanner tastiera = new Scanner(System.in);
		 * System.out.println("Quanti numeri vuoi inserire?:"); int lunghezza =
		 * tastiera.nextInt(); int[] listNum = new int[lunghezza];
		 * 
		 * int somma = 0; for (int i = 0; i < listNum.length; i++) {
		 * System.out.println("inserisce il num:"); listNum[i] = tastiera.nextInt();
		 * somma += listNum[i]; }
		 * 
		 * System.out.println("la somma degli num del array: " + somma);
		 * 
		 * // conversione del int en double per la media(promedio) double castMedia =
		 * (double) somma / listNum.length;
		 * System.out.println("la media degli num del array: " + castMedia);
		 */

		System.out.println("---------------------------------------");
		// Copia l’array in un nuovo array
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Quanti numeri vuoi inserire?:");
		int lunghezza = tastiera.nextInt();
		int[] listNum = new int[lunghezza];
		int[] copiaLisNum = new int[listNum.length];

		for (int i = 0; i < listNum.length; i++) {
			System.out.println("inserisce un numero:");
			;
			listNum[i] = tastiera.nextInt();
			copiaLisNum[i] = listNum[i];
		}

		System.out.println("numeri del array originale:");
		for (int i : listNum) {
			System.out.print(i + "/");
		}

		System.out.println("");

		System.out.println("numeri del array copia:");
		for (int i : copiaLisNum) {
			System.out.print(i + "/");
		}

		System.out.println("");

		// Conta i numeri pari del array copia

		int contPari = 0;
		for (int i = 0; i < copiaLisNum.length; i++) {
			if (copiaLisNum[i] % 2 == 0) {
				contPari++;
			}
		}
		System.out.println("Nel array copia ci sono: " + contPari + " numeri pari");

	}

}
