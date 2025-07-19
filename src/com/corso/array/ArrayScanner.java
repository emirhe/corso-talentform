package com.corso.array;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		int[] numeri = new int[5];

		for (int i = 0; i < numeri.length; i++) {
			System.out.println("Inserisce il valor per l'indice: " + i);
			numeri[i] = tastiera.nextInt();
		}
		System.out.println("Numeri inseriti:");
		for (int i : numeri) {
			System.out.print(i + "-");
		}

		System.out.println("");
		System.out.println("------------------------------------------------");

		// . Stampa l’array al contrario

		System.out.println("Quanti numeri voi inserire nel array?");
		int quantitaArray = tastiera.nextInt();
		int[] listNum = new int[quantitaArray];

		for (int i = listNum.length - 1; i >= 0; i--) {
			System.out.println("inserisce il valore per l'indice: " + i);
			listNum[i] = tastiera.nextInt();
		}
		System.out.println("Numeri del array al contrario:");
		for (int i : listNum) {
			System.out.print(i + "-");
		}

		tastiera.close();

	}

}
