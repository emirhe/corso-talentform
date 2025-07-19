package com.corso.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsExercisesTwo {

	public static void main(String[] args) {

		// Chiedi due numeri all’utente e ripeti finché non vengono inseriti
		// correttamente.

		Scanner tastiera = new Scanner(System.in);
		int primoNum = 0;
		int secondoNum = 0;

		boolean verifica = false;
		while (!verifica) {
			try {
				System.out.println("inserisce il primo num:");
				primoNum = tastiera.nextInt();

				System.out.println("inserisce il secondo num:");
				secondoNum = tastiera.nextInt();

				verifica = true;
			} catch (InputMismatchException e) {
				System.out.println("Error. Inserisci solo numeri interi");
				tastiera.nextLine(); // pulizia del buffer
			}
		}
		System.out.println("Hai inserico i numeri con successo: " + primoNum + " / " + secondoNum);
		System.out.println("Grazie per la tua partecipazione");
		tastiera.close();
	}

}
