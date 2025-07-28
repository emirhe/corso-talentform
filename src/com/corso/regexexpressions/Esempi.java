package com.corso.regexexpressions;

public class Esempi {

	public static void main(String[] args) {

		/*
		 * Scrivi un'espressione regolare per verificare se una stringa contiene solo
		 * lettere (maiuscole e minuscole).
		 */

		String texto = "Mi nombre es Emir Hernandez";
		if (texto.matches("[A-Za-z ]+")) {
			System.out.println("Contiene solo lettere");
		} else {
			System.out.println("Ci sono presenti altri caratteri");
		}

		/*
		 * Controlla se una stringa contiene solo cifre numeriche.
		 */

		String id = "25486";
		if (id.matches("\\d+")) {
			System.out.println("Contiene solo numeri");
		} else {
			System.out.println("Ci sono presenti altri caratteri");
		}

		/* Verifica se una stringa è un'email valida del tipo nome@dominio.com. */

		String email = "nome@dominio.com";
		if (email.matches("[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}")) {
			System.out.println("E-mail corretta");
		} else {
			System.out.println("Inserisce una email corretta");
		}

		/*
		 * Verifica se una password contiene almeno una maiuscola, una minuscola, un
		 * numero e almeno 8 caratteri.
		 */

		String password = "Asdflk1sd";
		if (password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$")) {
			System.out.println("Password corretta");
		} else {
			System.out.println("Inserisce nuovamente la password");
		}

	}

}
