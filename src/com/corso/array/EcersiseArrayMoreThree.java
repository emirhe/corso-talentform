package com.corso.array;

import java.util.Scanner;

public class EcersiseArrayMoreThree {

	public static void main(String[] args) {
		// Cerca un numero

		Scanner tastiera = new Scanner(System.in);

		System.out.println("Quanti numeri vuoi inserire?:");
		int lunghezza = tastiera.nextInt();
		int[] listNum = new int[lunghezza];

		for (int i = 0; i < listNum.length; i++) {
			System.out.println("inserice un numero:");
			listNum[i] = tastiera.nextInt();
		}

		System.out.println("Che numero decidere cercare?:");
		int cercaNum = tastiera.nextInt();
		boolean trovato = false;

		for (int i = 0; i < listNum.length; i++) {
			if (listNum[i] == cercaNum) {
				trovato = true;
				System.out.println("il numero: " + cercaNum + " si trova nel array, nella posizione: " + i);
				break;
			}
		}

		if (!trovato) {
			System.out.println("il numero: " + cercaNum + " ,che stai cercando non si trova nel array");
		}

	}

}
