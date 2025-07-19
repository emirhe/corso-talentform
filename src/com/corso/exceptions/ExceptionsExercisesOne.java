package com.corso.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsExercisesOne {
	public static void main(String[] args) {

		// ArithmeticException
		try {
			int a = 5 / 0;
			System.out.println("risoltato: " + a);
		} catch (ArithmeticException e) {
			System.out.println("Errore: Il numero non si puo dividere per 0");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Exception eseguita");
		}

		System.out.println("----------------------------------------");

		// ArrayIndexOutOfBoundsException
		try {
			int[] num = { 1, 2, 3, 4, 5, 6 };
			System.out.println(num[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("indice inesistente");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Exception gestita");
		}

		System.out.println("----------------------------------------");
		// InputMismatchException
		// Gestisci input non numerico usando Scanner.
		Scanner tastiera = new Scanner(System.in);

		try {
			System.out.println("Inserisce un numero:");
			int num = tastiera.nextInt();
			System.out.println("il num è: " + num);
		} catch (InputMismatchException e) {
			System.out.println("Error. Non hai inserito un numero");
			tastiera.nextLine();// limpiar buffer
		} finally {
			System.out.println("Exception gestita");
		}

		System.out.println("----------------------------------------");
		/*
		 * In un array di stringhe, controlla se uno degli elementi è null e lancia
		 * NullPointerException
		 */

		System.out.println("array corretto?:");
		try {
			String[] words = { "paper", "pencil", "book", null, "laptop" };
			for (String i : words) {
				i.length();
			}
		} catch (NullPointerException e) {
			System.out.println("Error. L'array contiene un null");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Exception eseguita");
		}

		System.out.println("----------------------------------------");

	}
}
