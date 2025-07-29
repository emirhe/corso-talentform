package com.corso.poo.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ExerciseArrayList {

	public static void main(String[] args) {
		/* Stampa il secondo elemento di un ArrayList contenente numeri interi */

		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(5);
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		numbers.add(25);

		System.out.println("Il secondo elemento è: " + numbers.get(1));

		System.out.println("----------------------");
		/*
		 * Sostituisci il primo elemento di un ArrayList di stringhe con un altro
		 * valore.
		 */

		ArrayList<String> nomeStrings = new ArrayList<>();

		nomeStrings.add("Julio");
		nomeStrings.add("Maria");
		nomeStrings.add("Laura");
		nomeStrings.add("Mario");

		nomeStrings.set(0, "Roman");

		System.out.println(nomeStrings);

		System.out.println("----------------------");
		/* Rimuovi il numero 15 da un ArrayList di interi. */

		ArrayList<Integer> numArrayList = new ArrayList<>();
		numArrayList.add(11);
		numArrayList.add(13);
		numArrayList.add(15);
		numArrayList.add(17);

		numArrayList.remove(2);

		System.out.println(numArrayList);

		System.out.println("----------------------");
		/* Stampa quanti elementi contiene un ArrayList. */

		ArrayList<String> colori = new ArrayList<>();
		colori.add("bianco");
		colori.add("nero");
		colori.add("verde");
		colori.add("rosso");

		System.out.println("L'array list ha: " + colori.size() + " elementi");

		System.out.println("----------------------");

		/* Verifica se un ArrayList contiene il valore "Roma". */
		System.out.println(colori.contains("Roma"));

		System.out.println("----------------------");

		/* Svuota un ArrayList e verifica che sia vuoto. */

		ArrayList<Integer> listnum = new ArrayList<>();
		listnum.add(1);
		listnum.add(2);
		listnum.add(3);
		listnum.add(4);

		System.out.println(listnum);
		listnum.clear();
		System.out.println("L'array è vuoto? " + listnum.isEmpty());

		System.out.println("----------------------");
		/* Ordina un ArrayList di numeri in ordine crescente. */
		ArrayList<Integer> listnumD = new ArrayList<>();
		listnumD.add(25);
		listnumD.add(32);
		listnumD.add(1);
		listnumD.add(8);
		listnumD.add(102);

		Collections.sort(listnumD);
		System.out.println(listnumD);

		System.out.println("----------------------");
		/*
		 * Crea un ArrayList di caratteri e sostituisci 2 elementi con dei nuovi e
		 * stampalo.
		 */

		ArrayList<Character> vocales = new ArrayList<>();

		vocales.add('a');
		vocales.add('e');
		vocales.add('i');
		vocales.add('o');
		vocales.add('u');

		System.out.println(vocales);

		vocales.set(2, '&');
		vocales.set(4, '€');

		System.out.println(vocales);

		System.out.println("----------------------");
		/*
		 * Calcola la somma degli interi in un ArrayList.
		 */
		ArrayList<Integer> numSommare = new ArrayList<>();
		numSommare.add(2);
		numSommare.add(3);
		numSommare.add(5);

		int somma = 0;
		for (int i : numSommare) {
			somma += i;
		}
		System.out.println(somma);

		System.out.println("----------------------");
		/*
		 * Copia tutti gli elementi da una lista String a un’altra.
		 */

		ArrayList<String> animalList = new ArrayList<>();
		animalList.add("gato");
		animalList.add("perro");
		animalList.add("pesce");
		ArrayList<String> newAnimalList = new ArrayList<>(Arrays.asList("", "", ""));

		Collections.copy(newAnimalList, animalList);

		System.out.println(newAnimalList);

	}

}
