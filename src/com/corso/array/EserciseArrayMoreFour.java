package com.corso.array;

import java.util.Scanner;

public class EserciseArrayMoreFour {

	public static void main(String[] args) {
		// Rimozione di un elemento in coda all’array

		Scanner tastiera = new Scanner(System.in);

		int[] listNum = new int[5];

		for (int i = 0; i < listNum.length; i++) {
			System.out.println("inserice un numero:");
			listNum[i] = tastiera.nextInt();
		}

		System.out.println("Indice da rimuover da 0 a 4:");
		int posizione = tastiera.nextInt();

		if (posizione < 0 || posizione >= listNum.length) {
			System.out.println("Posizione non trovata");
		} else {
			int[] newListNum = new int[listNum.length - 1];
			for (int i = 0, j = 0; i < listNum.length; i++) {
				if (i != posizione) {
					newListNum[j++] = listNum[i];
				}
			}
			System.out.println("array dopo la rimozione:");
			for (int i : newListNum) {
				System.out.println(i);
			}
		}

		// Aggiungere di un elemento in coda all’array

		// pedimos el numero nuevo para agregar
		System.out.println("inserisci un nuovo numero da aggiungere in coda:");
		int nuovoNum = tastiera.nextInt();

		// se crea un nuovo array con tamano +1
		int[] newListNum = new int[listNum.length + 1];

		// copia elementi en nuovo array
		for (int i = 0; i < listNum.length; i++) {
			newListNum[i] = listNum[i];
		}

		// agregamos el nuevo numero al final
		newListNum[newListNum.length - 1] = nuovoNum;

		// mostramos el nuevo array
		System.out.println("Array aggiornato con l'elemento in coda:");
		for (int i : newListNum) {
			System.out.print(i + "/");
		}

	}

}
