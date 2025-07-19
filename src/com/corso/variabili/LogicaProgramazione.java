package com.corso.variabili;

public class LogicaProgramazione {

	public static void main(String[] args) {

		// --- ESTRUCTURAS SELECTIVAS -----

		// Condicionales

		// if
		/*
		 * int x = 10;
		 * 
		 * int y = 8;
		 * 
		 * if (x > y) { System.out.println("Il numero maggiore: " + x); }
		 * 
		 * System.out.println("---------------------");
		 * 
		 * // if else if (x < y) { System.out.println("Il numero maggiore: " + y); }
		 * else { System.out.println("Il numero minore: " + y); }
		 * 
		 * System.out.println("---------------------");
		 * 
		 * // Condicionales multiples o anidadas
		 * 
		 * // else if int time = 22;
		 * 
		 * if (time < 10) { System.out.println("Good morning"); } else if (time < 18) {
		 * System.out.println("Good day"); } else { System.out.println("Good evening");
		 * }
		 */

		System.out.println("---------------------");

		// Esercizio

		// switch

		int day = 4;

		System.out.println("Che giorno è oggi?: ");
		switch (day) {
		case 1:
			System.out.println("lunedì");
			break;
		case 2:
			System.out.println("martedì");
			break;
		case 3:
			System.out.println("mercoledì");
			break;
		case 4:
			System.out.println("giovedì");
			break;
		case 5:
			System.out.println("venerdì");
			break;
		case 6:
			System.out.println("sabato");
			break;
		case 7:
			System.out.println("domenica");
			break;
		default:
			System.out.println("I numero: " + day + " non è valido");
		}

		System.out.println("---------------------");

		// Domande
		System.out.println("In qualle parte della settimana ci troviamo?:");
		if (day > 0 && day <= 5) {
			System.out.println("Siamo in settimana");
		} else if (day > 5) {
			System.out.println("Siamo nel weekend");
		} else {
			System.out.println("I numero: " + day + " non è valido");
		}

		System.out.println("---------------------");

		// Richiesta professore:

		System.out.println("è il weekend?:");
		if (day > 5) {
			System.out.println("si");
		} else {
			System.out.println("no");
		}

		System.out.println("è mercoledì?:");
		if (day == 3) {
			System.out.println("si");
		} else {
			System.out.println("no");
		}

	}

}
