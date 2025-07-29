package com.corso.poo.collections.maps;

import java.util.HashMap;

public class ExerciseHashMapOne {

	public static void main(String[] args) {

		HashMap<String, String> images = new HashMap<>();

		images.put("id01", "auto.png");
		images.put("id02", "frutta.png");
		images.put("id03", "articoli.png");

		System.out.println("dentro il map ci sono: " + images.size() + " elementi");

		System.out.println(images);

		if (images.containsKey("id03")) {
			// Mapping
			String img = images.get("id03");
			// Printing value for the coresponding key
			System.out.println("Il valore del key è: " + img);
		}

		System.out.println("-------");

		HashMap<String, Integer> nomi = new HashMap<>();
		nomi.put("Leonor", 30);
		nomi.put("Pedro", 38);
		nomi.put("Anna", 35);

		System.out.println(nomi.get("Anna"));

		System.out.println("-------");
		// Rimuovi "Luca" dal dizionario.

		HashMap<Integer, String> dizionario = new HashMap<>();
		dizionario.put(1, "Luca");
		dizionario.put(2, "Francesco");
		dizionario.put(3, "Susan");

		System.out.println("map prima:" + dizionario);
		dizionario.remove(1);
		System.out.println("map dopo:" + dizionario);

		System.out.println("-------");
		// Controlla se "Francesco" è presente.

		System.out.println("-------");
		System.out.println("Francesco è presente: " + dizionario.containsValue("Francesco"));

		System.out.println("-------");

		// Stampa tutte le chiavi del HashMap.
		HashMap<Integer, String> persone = new HashMap<>();
		persone.put(526, "Sara");
		persone.put(536, "Monica");
		persone.put(546, "Laura");
		persone.put(556, "Carla");

		// con foreach - recorriendo el map
		for (Integer i : persone.keySet()) {
			System.out.print(i + "/");
		}
		System.out.println("");
		// metodo directo
		System.out.println(persone.keySet());

		System.out.println("-------");

		// Stampa ogni nome con la rispettiva età.
		HashMap<String, Integer> listaStudenti = new HashMap<>();
		listaStudenti.put("Sofia", 36);
		listaStudenti.put("Martha", 30);
		listaStudenti.put("Roberto", 34);
		listaStudenti.put("Carlos", 31);

		for (String name : listaStudenti.keySet()) {
			System.out.println(name + " - " + listaStudenti.get(name));
		}

		System.out.println("-------");

		listaStudenti.clear();
		System.out.println("Il map adeso è vuoto?: " + listaStudenti.isEmpty());

		System.out.println("-------");

		/*
		 * Crea una HashMap<Integer, Integer> dove la chiave è un numero da 1 a 5 e il
		 * valore è il suo quadrato.
		 */

		HashMap<Integer, Integer> mapQuadrati = new HashMap<>();

		for (int i = 1; i < 6; i++) {
			mapQuadrati.put(i, i * i);
		}

		System.out.println(mapQuadrati);

		System.out.println("---------------");
		// Trova la persona con l’età massima

		HashMap<String, Integer> grupPerson = new HashMap<>();
		grupPerson.put("Paulo", 32);
		grupPerson.put("Hector", 38);
		grupPerson.put("Rogelio", 42);
		grupPerson.put("Lorenzo", 68);

		int max = 0;
		String nome = null;

		for (String i : grupPerson.keySet()) {
			if (max < grupPerson.get(i)) {
				max = grupPerson.get(i);
				nome = i;
			}
		}

		System.out.println("La persona più grande è: " + nome + " e ha: " + max);

		System.out.println("---------------");
		// Data una mappa di persone aggiungi "Sara" solo se non è già presente.

		if (grupPerson.containsKey("Sara")) {
			System.out.println("Sara è gia nel map");
		} else {
			grupPerson.put("Sara", 51);
			System.out.println(grupPerson);
		}

		// Metodo per agregar al map solo si no esta este elemento
		grupPerson.putIfAbsent("Sara", 51);

	}

}
