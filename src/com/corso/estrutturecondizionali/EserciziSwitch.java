package com.corso.estrutturecondizionali;

public class EserciziSwitch {

	public static void main(String[] args) {

		// USA UNO SWITCH PER STAMPARE IL GIORNO DELLA SETTIMANA DATO UN NUMERO DA 1 A 7

		int day = 2;
		switch (day) {
		case 1:
			System.out.println("Oggi è lunedì");
			break;
		case 2:
			System.out.println("Oggi è martedì");
			break;
		case 3:
			System.out.println("Oggi è mercoledì");
			break;
		case 4:
			System.out.println("Oggi è giovedì");
			break;
		case 5:
			System.out.println("Oggi è venerdì");
			break;
		case 6:
			System.out.println("Oggi è sabato");
			break;
		case 7:
			System.out.println("Oggi è domenica");
			break;
		default:
			System.out.println("I numero: " + day + " non è valido");
		}

		System.out.println("-------------------------------");

		/*
		 * SIMULA UN MENU DI UN RISTORANTE UTILIZZANDO IL COMANDO SWITCH PER SCEGLIERE
		 * TRA 3 PIATTI
		 */
		System.out.println("*** Menu Ristorante ****");
		System.out.println("1. Cheese Burgher");
		System.out.println("2. Pizza");
		System.out.println("3. Fritto Misto");
		System.out.println("****");
		System.out.println("Seleziona una opzione tra 1 e 3:");

		int optionMenu = 2;
		switch (optionMenu) {
		case 1:
			System.out.println("Hai selezionato Cheese Burgher");
			break;
		case 2:
			System.out.println("Hai selezionato Pizza");
			break;
		case 3:
			System.out.println("Hai selezionato Fritto Misto");
			break;
		default:
			System.out.println("Non hai selezionato una opzione valida");
		}

		System.out.println("-------------------------------");

		/*
		 * USA UNO SWITCH PER STAMPARE LA STAGIONE DATO UN MESE (ES 1 = GENNAIO=
		 * INVERNO)
		 */

		int mese = 2;

		switch (mese) {
		case 1:
		case 2:
		case 3:
			System.out.println("Siamo nella stagione inverno");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Siamo nella stagione primavera");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("Siamo nella stagione estate");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("Siamo nella stagione otonno");
			break;
		default:
			System.out.println("I numero: " + mese + " non è valido");
		}

		System.out.println("-------------------------------");

		// SIMULA UNA CALCOLATRICE BASE CON SWITCH (+ - */)

		System.out.println("*** Calcolatrice ***");
		double num1 = 2;
		double num2 = 3;
		double resultato;
		char operation = '*';

		switch (operation) {
		case '+':
			resultato = num1 + num2;
			System.out.println(resultato);
			break;
		case '-':
			resultato = num1 - num2;
			System.out.println(resultato);
			break;
		case '*':
			resultato = num1 * num2;
			System.out.println(resultato);
			break;
		case '/':
			if (num2 != 0) {
				resultato = num1 / num2;
				System.out.println(resultato);
			} else {
				System.out.println("operazione non valida");
			}
			break;
		default:
			System.out.println("Operazione non valida");
			;
		}

		System.out.println("-------------------------------");

		/*
		 * DATO UN CODICE PRODOTTO USA UNO SWITCH PER MOSTRARE NOME E PREZZO
		 */

		int productCode = 555;
		String productName;
		double prezzo;

		switch (productCode) {
		case 555:
			productName = "Laptop MSI";
			prezzo = 1056.56;
			System.out.println(productName + "/" + " €" + prezzo);
			break;
		case 556:
			productName = "MacBook Pro";
			prezzo = 1700.99;
			System.out.println(productName + "/" + " €" + prezzo);
			break;
		case 557:
			productName = "Laptop Dell";
			prezzo = 956.60;
			System.out.println(productName + "/" + " €" + prezzo);
			break;
		case 558:
			productName = "Laptop Lenovo";
			prezzo = 1200;
			System.out.println(productName + "/" + " €" + prezzo);
			break;
		default:
			System.out.println("Codice prodotto non valida");
			;
		}

		System.out.println("-------------------------------");
		/*
		 * SCRIVI UN PROGRAMMA CHE USA IF PER VERIFICARE L'ETA', E SWITCH PER DECIDERE
		 * IL TIPO DI BIGLIETTO (ES.JUNIOR-ADULTI-SENIOR)
		 */

		int eta = 18;
		String tipoTicketString;

		if (eta < 18) {
			tipoTicketString = "Junior";
		} else if (eta < 60) {
			tipoTicketString = "Adulti";
		} else {
			tipoTicketString = "Senior";
		}

		tipoTicketString = tipoTicketString;

		switch (tipoTicketString) {

		case "Junior":
			System.out.println("Hai acquistato un bliglieto tipo:  " + tipoTicketString);
			break;
		case "Adulti":
			System.out.println("Hai acquistato un bliglieto tipo: " + tipoTicketString);
			break;
		case "Senior":
			System.out.println("Hai acquistato un bliglieto tipo: " + tipoTicketString);
			break;
		default:
			System.out.println("opzione non valida");
		}

		System.out.println("-------------------------------");

		/*
		 * USA UNO SWITCH PER STAMPARE IL NOME DEL MESE E STAMPA SE HA 31 O 30 GIORNI
		 */

		int numMese = 8;

		switch (numMese) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("il mese num: " + numMese + " ha 31 giorni");
			break;
		case 2:
			System.out.println("il mese num: " + numMese + " ha 28 giorni");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("il mese num: " + numMese + " ha 30 giorni");
			break;
		default:
			System.out.println("numero mese non valido");
		}

		System.out.println("-------------------------------");

		/*
		 * DATO UN VOTO IN LETTERE(A,B,C, ECC..), STAMPA CON SWITCH IL VALORE NUMERICO
		 * EQUIVALENTE
		 */

	}

}
