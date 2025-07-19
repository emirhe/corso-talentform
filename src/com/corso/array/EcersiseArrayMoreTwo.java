package com.corso.array;

import java.util.Scanner;

public class EcersiseArrayMoreTwo {

	public static void main(String[] args) {

		Scanner tastiera = new Scanner(System.in);

		System.out.println("Quanti numeri vuoi inserire?:");
		int lunghezza = tastiera.nextInt();
		int[] listNum = new int[lunghezza];

		for (int i = 0; i < listNum.length; i++) {
			System.out.println("inserice un numero:");
			listNum[i] = tastiera.nextInt();
		}

		// Stampa i numeri del array

		System.out.println("i numeri del array sono:");
		for (int i : listNum) {
			System.out.print(i + "/");
		}

		System.out.println("");
		System.out.println("------------------");

		// Scambia primo e ultimo elemento

		int scambio = listNum[0];
		listNum[0] = listNum[listNum.length - 1];
		listNum[listNum.length - 1] = scambio;

		System.out.println("Scambio del primo e ultimo elemento");
		for (int i : listNum) {
			System.out.print(i + "/");
		}

	}

}
