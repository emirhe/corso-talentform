package com.corso.estruttureloop;

public class EserciziLoopGruppo {

	public static void main(String[] args) {

		// Scrivi un programma che stampa i numeri da 1 a 10 usando un ciclo for.
		/*
		 * for (int i = 1; i <= 10; i++) { System.out.println(i); }
		 * 
		 * System.out.println("---------------------");
		 * 
		 * // Scrivi un programma che calcola la somma dei numeri da 1 a 100 usando un
		 * // ciclo for.
		 * 
		 * int cont = 0;
		 * 
		 * for (int i = 0; i <= 100; i++) { cont = cont + i; }
		 * System.out.println("la somma dei numeri da 1 a 100 è: " + cont);
		 * 
		 * System.out.println("---------------------");
		 * 
		 * // Scrivi un programma che stampa la tabellina del 7 (da 1×7 a 10×7).
		 * 
		 * int tab = 7; int prod = 1; for (int i = 1; i <= 10; i++) { prod = i * tab;
		 * System.out.println("7x" + i + "=" + prod); }
		 * 
		 * System.out.println("---------------------");
		 * 
		 * // Scrivi un programma che stampa i numeri pari da 2 a 20.
		 * 
		 * for (int i = 2; i <= 20; i += 2) { System.out.println(i); }
		 * 
		 * System.out.println("---------------------");
		 * 
		 * // Scrivi un programma che calcola il fattoriale del numero 5 (cioè 5 × 4 × 3
		 * × // 2 × 1).
		 * 
		 * int num = 5; int fattoriale = 1;
		 * 
		 * for (int i = 1; i <= num; i++) { fattoriale = fattoriale * i; }
		 * System.out.println("il fattoriale di: " + num + " è: " + fattoriale);
		 * 
		 * System.out.println("---------------------");
		 * 
		 * // Scrivi un programma che stampa tutti i numeri da 1 a 50 divisibili per 3.
		 * 
		 * for (int i = 1; i <= 50; i++) { if (i % 3 == 0) { System.out.println(i); } }
		 * 
		 * System.out.println("---------------------");
		 * 
		 * // Stampa il quadrato di ogni numero da 1 a 10 (es: 1² = 1, 2² = 4, ecc.).
		 * 
		 * for (int i = 1; i <= 10; i++) { int pot = i * i;
		 * System.out.println("Il num: " + i + " elevato alla seconda potenza è: " +
		 * pot); }
		 * 
		 * System.out.println("---------------------");
		 * 
		 * // Calcola e stampa la somma dei primi n numeri dispari (es. n = 5 → 1 + 3 +
		 * 5 + // 7 + 9 = 25).
		 * 
		 * int somma = 0; int n = 5; int numeroi = 1;
		 * 
		 * for (int i = 1; i <= n; i++) { somma += numeroi; numeroi += 2; }
		 * System.out.println("somma primi " + n + " numeri dispari " + somma);
		 * 
		 * System.out.println("---------------------");
		 * 
		 * // Dato base = 2 ed esponente = 5, calcola 2 elevato a 5
		 * 
		 * int prodotto = 1; int base = 2; int esponente = 5;
		 * 
		 * for (int i = 1; i <= esponente; i++) { prodotto = prodotto * base; }
		 * System.out.println("2^5= " + prodotto);
		 * 
		 * System.out.println("---------------------");
		 * 
		 * // Scrivi un programma che stampa tutti i numeri primi da 2 a 100 usando solo
		 * // for.
		 * 
		 * // Bucle externo: recorre cada número del 2 al 100 for (int numero = 2;
		 * numero <= 100; numero++) { boolean primo = true; // Asumimos que el número es
		 * primo inicialmente
		 * 
		 * // Bucle interno: verifica si el número actual es divisible por algún otro //
		 * número // desde 2 hasta la mitad del número actual. // Si encontramos un
		 * divisor, sabemos que no es primo. for (int i = 2; i <= numero / 2; i++) { if
		 * (numero % i == 0) { // Si el residuo es 0, es divisible primo = false; // No
		 * es primo break; // Salimos del bucle interno, ya no necesitamos seguir
		 * verificando } }
		 * 
		 * // Si esPrimo sigue siendo verdadero, significa que no se encontraron
		 * divisores // (aparte de 1 y el propio número), por lo tanto, es un número
		 * primo. if (primo) { System.out.print(numero + " "); } }
		 * System.out.println("");
		 * 
		 * /* Scrivi un programma che confronta due potenze: a = 2, b = 5 Calcola 2^5 e
		 * 5^2 e stampa quale dei due è maggiore.
		 * 
		 * System.out.println("---------------------"); int prodotto1 = 1; int base1 =
		 * 2; int esponente1 = 5;
		 * 
		 * int prodotto2 = 1; int base2 = 5; int esponente2 = 2;
		 * 
		 * for (int i = 1; i <= esponente1; i++) { prodotto1 = prodotto1 * base1; } for
		 * (int i = 1; i <= esponente2; i++) { prodotto2 = prodotto2 * base2; }
		 * 
		 * if (prodotto1 > prodotto2) { System.out.println("la potenza 2^5= " +
		 * prodotto1 + " è maggiore"); } else { System.out.println("la potenza 5^2= " +
		 * prodotto2 + " è maggiore"); }
		 * 
		 * System.out.println("---------------------");
		 * 
		 * // Scrivi un programma che stampa i numeri da 1 a 10 usando un ciclo
		 * 
		 * for (int i = 1; i <= 10; i++) { System.out.print(i + " - "); }
		 * 
		 * System.out.println(""); System.out.println("---------------------");
		 * 
		 * // Scrivi un programma che calcola la somma dei numeri da 1 a 100 usando
		 * while.
		 * 
		 * int nume = 1; int somma1 = 0; while (nume <= 100) { somma1 += nume; nume++; }
		 * System.out.println(somma1); System.out.println("---------------------");
		 * 
		 * // Scrivi un programma che stampa tutti i numeri pari da 2 a 20 usando while.
		 * 
		 * int nume2 = 2; while (nume2 < 20) { System.out.print(nume2 + "-"); nume2 +=
		 * 2;
		 * 
		 * } System.out.println(""); System.out.println("---------------------");
		 * 
		 * // Scrivi un programma che calcola il fattoriale di 5 usando while.
		 * 
		 * int a = 1; int fattoriale2 = 1; int numFattore = 5;
		 * 
		 * while (a <= numFattore) { fattoriale2 = fattoriale2 * a; a++;
		 * System.out.println(fattoriale2); }
		 * 
		 * System.out.println("---------------------");
		 * 
		 * // Stampa la tabellina del 4 da 1×4 a 10×4 usando while.
		 * 
		 * int contTab = 1;
		 * 
		 * while (contTab <= 10) { System.out.println(contTab + "x4= " + (contTab * 4));
		 * contTab++; }
		 * 
		 * /* Scrivi un programma che calcola quante cifre ha un numero intero positivo
		 * (es. numero = 3456 ha 4 cifre).
		 */

		/*
		 * Scrivi un programma che calcola la somma delle cifre di un numero intero
		 * positivo. Esempio: 123 → 1 + 2 + 3 = 6.
		 */

		// Scrivi un programma che inverte un numero intero positivo. Esempio: 1234 →
		// 4321

		System.out.println("---------------------");

		int numEntero = 1234;
		int numReverse = 0;
		while (numEntero > 0) {
			int cifra = numEntero % 10;
			numReverse = (numReverse * 10) + cifra;
			numEntero = numEntero / 10;
		}

		System.out.println(numReverse);
		System.out.println("---------------------");

		/*
		 * Scrivi un programma che stampa tutti i divisori di un numero intero positivo.
		 * Esempio: n = 12 → 1 2 3 4 6 12
		 */
		System.out.println("---------------------");
		int numDiviso = 12;
		int numList = 1;
		while (numList <= numDiviso) {
			if (numDiviso % numList == 0) {
				System.out.println(numList + "");
			}
			numList++;
		}

		System.out.println("---------------------");

		/*
		 * Scrivi un programma che verifica se un numero intero maggiore di 1 è primo
		 * (divisibile solo per 1 e sé stesso).
		 */

		/*
		 * Scrivi un programma che stampa la rappresentazione binaria di un numero
		 * intero positivo. Esempio: 13 → 1101
		 */

		int numeroDeci = 13; // Declaramos e inicializamos el número decimal a convertir
		String binarioString = ""; // Inicializamos una cadena vacía para construir el resultado binario

		// Caso especial: Si el número es 0, su representación binaria es "0"
		if (numeroDeci == 0) {
			binarioString = "0";
		} else {
			// Si el número es mayor que 0, entramos en el bucle principal
			while (numeroDeci > 0) {
				// 1. Calcula el resto de la división por 2
				// (numeroDeci % 2) te dará 0 o 1.
				// 2. Concatena el resto al PRINCIPIO de binarioString.
				// Esto es crucial porque los restos se leen al revés.
				binarioString = (numeroDeci % 2) + binarioString;

				// 3. Actualiza numeroDeci con el cociente de la división entera por 2
				numeroDeci = numeroDeci / 2;
			}
		}
		System.out.println(binarioString);
		System.out.println("---------------------");

	}
}