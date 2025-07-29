package com.corso.poo.collections.sets;

import java.util.HashSet;
import java.util.List;

public class ExerciseSetTwo {

	public static void main(String[] args) {
		// Rimuovi da un HashSet tutti gli elementi presenti in un altro.

		HashSet<Integer> listNumA = new HashSet<>(List.of(2, 4, 6, 8, 10));
		HashSet<Integer> listNumB = new HashSet<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		System.out.println("Elementi prima lista");
		listNumA.forEach(System.out::println);

		System.out.println("Elementi seconda lista");
		listNumB.forEach(System.out::println);

		System.out.println("-----------");

		System.out.println("Rimozione di tutti gli elementi della lista 1, presenti nella lista 2");
		listNumB.removeAll(listNumA);
		listNumB.forEach(System.out::println);

		System.out.println("-----------");
		// Crea un HashSet<Integer>, aggiungi numeri e calcola la somma.

		int somma = 0;
		for (Integer i : listNumB) {
			somma += i;
		}

		System.out.println("la somma degli elementi del set è: " + somma);

	}

}
