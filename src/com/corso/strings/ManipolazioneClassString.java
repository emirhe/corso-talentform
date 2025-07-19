package com.corso.strings;

public class ManipolazioneClassString {

	public static void main(String[] args) {

		String word = "Emir";
		int text = word.length();
		System.out.println("--------------");

		System.out.println("String originale: " + word);
		System.out.println("Quanti numeri dei caratteri ha la parola?: " + text);
		System.out.println("--------------");

		// Trasformare testo in maiusculo e minusculo
		System.out.println("Transformare testo in tutto maiuscolo: " + word.toUpperCase());
		System.out.println("Transformare testo in tutto minusculo: " + word.toLowerCase());
		System.out.println("--------------");

		// Sostituire una letera
		String newWord = "casa";

		System.out.println("Sostituzione di carattare: " + newWord.replace('s', 'S'));
		System.out.println("Sostituzione di parole" + newWord.replace(newWord, word));
		System.out.println("--------------");

		// Concatenazione di String
		String firstWord = "  Ciao ";
		String secondWord = "Mondo";

		System.out.println("Concatenazione di parole" + firstWord.concat(secondWord));
		System.out.println("--------------");

		// Elimina gli spazi sia a sinistra che a destra
		System.out.println("Parola con spazi sia a destra che a sinistra: \n" + firstWord);
		System.out.println("Parola senza spazi sia a destra che a sinistra: \n" + firstWord.trim());
		System.out.println("--------------");

		// Uso del metodo substring
		String longText = "Questo è un sempio di testo per utilizzare il metodo substring";
		System.out.println("Substring usando solo beginIndex (begin 2): \n" + longText.substring(2));
		System.out.println("Substring usando beginIndex & endIndex (begin 0, end 11): \n" + longText.substring(0, 11));

		System.out.println("--------------");

		// Uso di blocco testo
		String bloccoTestoString = """
				Questo è un blocco
				di testo
				diviso in
				quatro righe
				""";
		System.out.println(bloccoTestoString);
		System.out.println("--------------");

		// Uso di equals & equalsIgnoreCase
		String a = "Ciao";
		System.out.println("La parola -Ciao- è identica a -ciao-?: " + a.equals("ciao"));
		System.out.println("La parola -Ciao- è identica a -CIAO-(IgnoreCase)?: " + a.equalsIgnoreCase("CIAO"));
		System.out.println("--------------");

		// Uso di contains
		System.out.println("La parola -Ciao- contiene la lettera a?: " + a.contains("a"));

		// Uso di StringBuilder (clase costruttora) & i suoi metodi
		StringBuilder costruttoreString = new StringBuilder("Testo di esempio");
		costruttoreString.append(" questo è un altro testo"); // metodo append: unisce una seconda string

		System.out.println(costruttoreString);
		System.out.println("--------------");

		StringBuilder color = new StringBuilder("red");
		color.insert(1, "blue"); // metodo insert: inserta testo in una determinata posizione
		System.out.println("insert: " + color);

		color.reverse(); // metodo reverse: invierte il contenuto
		System.out.println("reverse: " + color);

		System.out.println("--------------");

		// Esercizio
		StringBuilder esercizio = new StringBuilder("Primo testo");
		esercizio.append(" Secondo testo");
		System.out.println("append: " + esercizio);

		esercizio.insert(6, "esercizio insert");
		System.out.println("insert: " + esercizio);

		esercizio.delete(2, 5);
		System.out.println("delete: " + esercizio);

		esercizio.replace(8, 12, "learning");
		System.out.println("replase: " + esercizio);

	}

}
