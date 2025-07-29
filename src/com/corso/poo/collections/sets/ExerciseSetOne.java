package com.corso.poo.collections.sets;

import java.util.HashSet;
import java.util.List;

public class ExerciseSetOne {

	public static void main(String[] args) {

		HashSet<String> colori = new HashSet<>();

		colori.add("Rosso");
		colori.add("viola");
		colori.add("bianco");
		colori.add("giallo");
		colori.add("nero");

		for (String i : colori) {
			System.out.println(i);
		}

		System.out.println("----------------");

		HashSet<String> nomiPersona = new HashSet<>();
		nomiPersona.add("Pedro");
		nomiPersona.add("Pedro");
		nomiPersona.add("Pedro");
		nomiPersona.add("Jose");
		nomiPersona.add("Rafael");
		nomiPersona.add("Marcos");
		nomiPersona.add("Jorge");
		nomiPersona.add("Sofia");

		nomiPersona.forEach(System.out::println); // for each con method reference

		System.out.println("----------------");

		// Verifica se un HashSet contiene il valore "Milano".
		HashSet<String> citta = new HashSet<>();
		citta.add("Parma");
		citta.add("Roma");
		citta.add("Napoli");
		citta.add("Bologna");

		System.out.println("Nel set di citta c'e presente Milano?: " + citta.contains("Milano"));

		System.out.println("----------------");

		// Rimuovi "Roma" dal HashSet.
		citta.remove("Roma");
		System.out.println("Nel set c'e ancora Roma?: " + citta.contains("Roma"));

		System.out.println("----------------");
		// Svuota il set e verifica se è vuoto.

		citta.clear();
		System.out.println("Il set è vuoto? " + citta.isEmpty());

		System.out.println("----------------");

		// Trova gli elementi comuni tra due HashSet.
		HashSet<String> listOneStrings = new HashSet<>(List.of("lapiz", "libro", "marcador", "cuaderno"));
		HashSet<String> listTwoStrings = new HashSet<>(List.of("lapiz", "libro", "lapicero", "folder"));

		listOneStrings.forEach(System.out::println);

		System.out.println(listOneStrings.retainAll(listTwoStrings));

		System.out.println("----------retainAll------------");
		listOneStrings.retainAll(listTwoStrings);
		listOneStrings.forEach(System.out::println);

		System.out.println("----------Unione tra set-----------");
		// Unione tra set
		listOneStrings.addAll(nomiPersona);
		listOneStrings.forEach(System.out::println);

		System.out.println("--------------------------------");

		// Trova gli elementi presenti in set1 ma non in set2.
		HashSet<String> listSetOne = new HashSet<>(List.of("lapiz", "libro", "marcador", "cuaderno"));
		HashSet<String> listSetTwo = new HashSet<>(List.of("lapiz", "libro", "lapicero", "folder"));

		HashSet<String> listElementiNoComune = new HashSet<>(listSetOne);

		listElementiNoComune.removeAll(listSetTwo);

		listElementiNoComune.forEach(System.out::println);
	}

}
