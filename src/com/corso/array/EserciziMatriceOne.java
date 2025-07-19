package com.corso.array;

public class EserciziMatriceOne {

	public static void main(String[] args) {
		// Crea una matrice 2x3 e stampa tutti i suoi elementi.

		int[][] matrice = { { 2, 5, 6 }, { 2, 5, 7 } };

		for (int f = 0; f < matrice.length; f++) {
			for (int c = 0; c < matrice[f].length; c++) {
				System.out.print("[" + matrice[f][c] + "]");
			}
			System.out.println("");
		}

		System.out.println("---------------------------------------");
		// un'altra matrice

		int[][] newMatrice = { { 1, 0 }, { 0, 1 } };
		for (int f = 0; f < newMatrice.length; f++) {
			for (int c = 0; c < newMatrice[f].length; c++) {
				System.out.print("[" + newMatrice[f][c] + "]");
			}
			System.out.println("");
		}

		System.out.println("---------------------------------------");
		// matrice 2x4
		int[][] matriceFour = { { 1, 0, 5, 5 }, { 0, 1, 6, 7 } };

		for (int f = 0; f < matriceFour.length; f++) {
			for (int c = 0; c < matriceFour[f].length; c++) {
				System.out.print("[" + matriceFour[f][c] + "]");
			}
			System.out.println("");
		}

		System.out.println("---------------------------------------");
		// Somma tutti gli elementi di una matrice 3x3.

		int[][] matriceTrexTre = { { 1, 0, 5 }, { 0, 1, 6, }, { 0, 1, 6, } };
		int sommaElementi = 0;
		for (int f = 0; f < matriceTrexTre.length; f++) {
			for (int c = 0; c < matriceTrexTre[f].length; c++) {
				sommaElementi += matriceTrexTre[f][c];
			}
		}
		System.out.println("la somma degli elementi della matrice: " + sommaElementi);

		System.out.println("---------------------------------------");
		// Trova il valore massimo in una matrice 3x2.

		int[][] matriceTrexDue = { { 1, 58, 5 }, { 12, 1, 66 } };
		int numMax = matriceTrexDue[0][0];

		for (int f = 0; f < matriceTrexDue.length; f++) {
			for (int c = 0; c < matriceTrexDue[f].length; c++) {
				if (matriceTrexDue[f][c] > numMax) {
					numMax = matriceTrexDue[f][c];
				}
			}
		}
		System.out.println("il numero massimo nella matrice è: " + numMax);

		System.out.println("---------------------------------------");
		// Stampa la seconda riga di una matrice 3x3.
		System.out.println("stampa la seconda riga di una matrice 3x3");

		int[][] newMatriceTrexTre = { { 1, 0, 5 }, { 0, 1, 6, }, { 0, 1, 6, } };

		for (int colonna = 0; colonna < newMatriceTrexTre[1].length; colonna++) {
			System.out.print("[" + newMatriceTrexTre[1][colonna] + "]");
		}

		System.out.println("");
		System.out.println("-----------------");
		System.out.println("stampa la terza collona di una matrice 3x3");
		for (int riga = 0; riga < newMatriceTrexTre.length; riga++) {
			System.out.println("[" + newMatriceTrexTre[riga][2] + "]");
		}

		System.out.println("------------------------------------------");

		System.out.println("Matrice 3x3:");
		for (int riga = 0; riga < newMatriceTrexTre.length; riga++) {
			for (int colonna = 0; colonna < newMatriceTrexTre[riga].length; colonna++) {
				System.out.print("[" + newMatriceTrexTre[riga][colonna] + "]");
			}
			System.out.println("");
		}

		// Calcola la somma di ogni riga in una matrice 3x3.
		// Qui se fijan las filas para recorrer las columnas y sumas las filas

		for (int riga = 0; riga < newMatriceTrexTre.length; riga++) {
			int somma = 0;
			for (int colonna = 0; colonna < newMatriceTrexTre[riga].length; colonna++) {
				somma += newMatriceTrexTre[riga][colonna];
			}
			System.out.println("la somma della riga " + riga + " = " + somma);
		}

		System.out.println("------------------------------------------");
		// Calcola la somma di ogni colonna in una matrice 3x3.
		// Se necesita fijar las columnas para recorrer las filas y sumar las columnas

		for (int colonna = 0; colonna < newMatriceTrexTre[0].length; colonna++) {
			int somma = 0;
			for (int riga = 0; riga < newMatriceTrexTre.length; riga++) {
				somma += newMatriceTrexTre[riga][colonna];
			}
			System.out.println("la somma delle colonne " + colonna + " = " + somma);

		}

	}

}
