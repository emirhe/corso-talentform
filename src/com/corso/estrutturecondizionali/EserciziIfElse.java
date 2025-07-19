package com.corso.estrutturecondizionali;

public class EserciziIfElse {

	public static void main(String[] args) {

		/*
		 * int a = 2; int b = 5; int c = 6; int d = 1;
		 * 
		 * if (a < b && c > d) { System.out.println(true); } else if (d > c && b > a) {
		 * System.out.println(false); }
		 * 
		 * if (a > b || d > c) { int resultato = a + b; System.out.println(resultato); }
		 * else { System.out.println("non fa niente"); }
		 */

		// SCRIVI UN PROGRAMMA CHE CONTROLLA SE UN NUMERO E POSITIVO O NEGATIVO

		int a = 2;

		if (a > 0) {
			System.out.println("il numero: " + a + " è positivo");
		} else if (a < 0) {
			System.out.println("il numero: " + a + " è negativo");
		} else {
			System.out.println("il numero: " + a + " è neutro");
		}

		System.out.println("-------------------------------");

		// SCRIVI UN PROGRAMMA CHE CONTROLLA SE UN NUMERO E POSITIVO O NEGATIVO
		// il % calcola il resto di una divisione

		if (a % 2 == 0) {
			System.out.println("numero par");
		} else {
			System.out.println("numero impare");
		}

		System.out.println("-------------------------------");

		// CONTROLLA SE UN UTENTE E' MAGGIORENNE

		int eta = 20;
		if (eta >= 18) {
			System.out.println("l'utente è maggiorenne");
		} else {
			System.out.println("l'utente è minnorenne");
		}

		System.out.println("-------------------------------");

		// DATO UN NUMERO VERIFICA SE E' UN MULTIPLO DI 5

		int num = 40;

		if (num % 5 == 0) {
			System.out.println("il numero: " + num + " è multiplo di 5");
		} else {
			System.out.println("il numero: " + num + " non è multiplo di 5");
		}

		System.out.println("-------------------------------");

		// DATO UN CARATTERE, CONTROLLA SE E'UNA VOCALE O UNA CONSONANTE

		char word = 'n';
		if (word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u') {
			System.out.println("il carattere: " + word + " è un vocale");
		} else {
			System.out.println("il carattare: " + word + " è una consonante");
		}

		System.out.println("-------------------------------");

		// CONTROLLA SE UN NUMERO E' COMPRESO TRA 10 E 100

		int number = 9;
		if (number >= 10 && number <= 100) {
			System.out.println("il numero: " + number + " è compreso tra 10 e 100");
		} else {
			System.out.println("il numero non è compreso tra 10 e 100");
		}

		System.out.println("-------------------------------");

		// DATO IL VOTO DI UNO STUDENTE, STAMPA PROMOSSO SE >=6, ALTRIMENTI BOCCIATO

		int voto = 5;

		if (voto >= 6) {
			System.out.println("il voto: " + voto + " del studente è promosso");
		} else {
			System.out.println("il voto: " + voto + " del studente è bocciato");
		}

		System.out.println("-------------------------------");

		// VERIFICA SE DUE NUMERI SONO UGUALI

		int b = 6;
		int c = 6;

		if (b == c) {
			System.out.println("i numeri: " + b + " e " + c + " sono uguali");
		} else {
			System.out.println("i numeri non sono uguali");
		}

		System.out.println("-------------------------------");

		// STABILISCI IL MAGGIORE TRA DUE NUMERI INTERI

		int d = 8;
		int e = 9;

		if (d > e) {
			System.out.println("il numero maggiore è: " + d);
		} else if (e > d) {
			System.out.println("il numero maggiore è: " + e);
		} else {
			System.out.println("i numero sono uguali");
		}

		System.out.println("-------------------------------");

		// VERIFICA SE UNA STRINGA E' UNA VUOTA

		String sentence = "hola";
		if (sentence.isEmpty()) {
			System.out.println("la string è vuota?: " + true);
		} else {
			System.out.println("la string non è vuota?: " + false + " / e il suo contenuto è: " + sentence);
			System.out.println("la string ha un totale di: " + sentence.length() + " caratteri");
		}

		System.out.println("-------------------------------");

		// CAOLCO ANNO BISESTILE
		int anno = 2025;
		if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) {
			System.out.println("l'anno: " + anno + " è bisestile");
		} else {
			System.out.println("l'anno: " + anno + " non è bisestile");
		}

		System.out.println("-------------------------------");

		/*
		 * DATO UN NUMERO STAMPA DIVISIBILE PER 2 e 3, SOLO PER 2, SOLO PER 3 OPPURE CON
		 * NESSUNO
		 */

		int f = 24;

		if (f % 2 == 0 && f % 3 == 0) {
			System.out.println(f + " è divisibile sia per 2 che per 3");
		} else if (f % 2 == 0) {
			System.out.println(f + " è divisile solo per 2");
		} else if (f % 3 == 0) {
			System.out.println(f + " è divisile solo per 3");
		} else {
			System.out.println(f + " non è divisile con nessuno (2 o 3");
		}

		System.out.println("-------------------------------");

		// CONFRONTA TRE NUMERI E STAMPA IL MAGGIORE

		int g = 1, h = 2, i = 3;
		if (g > h && g > i) {
			System.out.println("tra le variabili con valore: " + g + "/" + h + "/" + i + " numero maggiore è: " + g);
		} else if (h > i) {
			System.out.println("tra le variabili con valore: " + g + "/" + h + "/" + i + " numero maggiore è: " + h);
		} else {
			System.out.println("tra le variabili con valore: " + g + "/" + h + "/" + i + " numero maggiore è: " + i);
		}

		System.out.println("-------------------------------");

		// CALCOLA IL PREZZO FINALE CON SCONTO: SE>100€, SCONTO 10%; SE >500€; SCONTO
		// 20%

		double prezzo = 400;
		double sconto;

		if (prezzo > 100 && prezzo <= 500) {
			sconto = 0.10;
			System.out.println("Il prezzo di: $" + prezzo + " ha un sconto del 10% " + "il totale a pagare: $"
					+ (prezzo - (prezzo * sconto)));
		} else if (prezzo > 500) {
			sconto = 0.20;
			System.out.println("Il prezzo di: $" + prezzo + " ha un sconto del 20% " + "il totale a pagare: $"
					+ (prezzo - (prezzo * sconto)));
		} else {
			System.out.println("prezzo non applica nessun sconto");
		}

		System.out.println("-------------------------------");

		// DATO UN VOTO DA 0 A 10, STAMPA INSUFFICIENTE, SUFFICIENTE, BUONO, OTTIMO

		int votoAlu = 10;
		if (votoAlu >= 6 && votoAlu < 8) {
			System.out.println("il voto: " + votoAlu + " è sufficiente");
		} else if (votoAlu >= 8 && votoAlu < 10) {
			System.out.println("il voto: " + votoAlu + " è buono");
		} else if (votoAlu == 10) {
			System.out.println("il voto: " + votoAlu + " è ottimo");
		} else {
			System.out.println("il voto: " + votoAlu + " è insuficente");
		}

		System.out.println("-------------------------------");

		// VERIFICA SE UNA PASSWORD E' LUNGA ALMENO 8 CARATTERI E CONTIENE ALMENE UNA
		// CIFRA

		String password = "sdfohosdfds123";
		boolean hasDigits = password.matches(".*\\d.*");
		if (password.length() >= 8 && hasDigits) {
			System.out.println("password valida");
		} else {
			System.out.println("password non valida");
		}

		System.out.println("-------------------------------");

		// DATO UN NUMERO, STAMPA SE E' CIFRA SINGOLA(0-9), A DUE CIFRE O SUPERIORE

		int cifra = -252;
		int transCifra = Math.abs(cifra);

		if (transCifra <= 9) {
			System.out.println("ha una singola cifra");
		} else if (transCifra <= 99) {
			System.out.println("ha due cifre");
		} else {
			System.out.println("ha più 3 o più cifre");
		}

		System.out.println("-------------------------------");

		/*
		 * CALCOLA IL PUNTEGGIO DI UN ESAME CON BONUS: SE HA SUPERATO TEST E PROGETTO, +
		 * 10 PUNTI DATO UN ORARIO
		 */

		double testCali = 60;
		double projCali = 55;
		double punteggioFinale = (testCali + projCali) / 2;

		if (testCali >= 60 && projCali >= 60) {
			punteggioFinale = punteggioFinale + 10;
			System.out.println("Sei promosso. Hai ottenuto un bonus di 10");
			System.out.println("Il punteggio finale è: " + punteggioFinale);

		} else if ((testCali >= 60 || projCali >= 60) && punteggioFinale >= 60) {
			System.out.println("Sei promosso.Non hai ottenuto il bonus. Il tuo punteggio finale è: " + punteggioFinale);

		} else {
			System.out.println("Punteggio final non superato: " + punteggioFinale);
		}

		System.out.println("-------------------------------");

		// DATO UN ORARIO 0-24 STAMPA MATTINA - POMERIGGIO- SERA-NOTTE

		int daytime = 12;
		if (daytime >= 6 && daytime <= 12) {
			System.out.println("Mattina");
		} else if (daytime > 12 && daytime <= 18) {
			System.out.println("Pomeriggio");
		} else if (daytime > 18 && daytime <= 24) {
			System.out.println("Sera");
		} else if (daytime >= 0 && daytime < 6) {
			System.out.println("Notte");
		} else {
			System.out.println("Non hai inserito un orario 0-24 valido!");
		}

		System.out.println("-------------------------------");

	}

}
