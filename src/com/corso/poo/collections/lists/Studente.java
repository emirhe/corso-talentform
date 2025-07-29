package com.corso.poo.collections.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Studente {

	public String nome;
	public String cognome;
	public int eta;

	public Studente(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Studente [" + nome + cognome + ", eta=" + eta + "]";
	}

	public static void main(String[] args) {

		ArrayList<Studente> listStudenti = new ArrayList<>();

		// Metodo 1
		Studente a = new Studente("Juan", "Martindez", 30);
		Studente b = new Studente("Carlos", "Lopez", 18);
		Studente c = new Studente("Maria", "Sanchez", 32);

		listStudenti.add(a);
		listStudenti.add(b);
		listStudenti.add(c);

		System.out.println("Per ora ci sono:" + listStudenti.size() + " studenti");

		// Primi studendi aggiunti
		for (Studente i : listStudenti) {
			System.out.println(i);
		}

		System.out.println("---------------------");
		// Metodo 2

		listStudenti.add(new Studente("Jorge", "Perez", 36));
		listStudenti.add(new Studente("Sara", "Salinas", 32));
		listStudenti.add(new Studente("Monica", "Gonzalez", 20));

		System.out.println("Dopo nel array list ci cono: " + listStudenti.size() + " studenti");

		// Tutti gli studenti
		for (Studente i : listStudenti) {
			System.out.println(i);
		}

		System.out.println("---------------------");
		/* Dato un ArrayList<Studente>, stampa solo quelli con età > 20. */
		System.out.println("Gli studenti maggiori di 20 anni sono:");

		for (Studente i : listStudenti) {
			if (i.getEta() > 20) {
				System.out.println(i);
			}
		}

		System.out.println("---------------------");
		// Ordina gli studenti in base all’età crescente.
		listStudenti.sort(Comparator.comparingInt(s -> s.getEta())); // expresion lambda: es como una funcion chiquita y
																		// sin nombre que puedes pasar como si fuera un
																		// dato
		for (Studente i : listStudenti) {
			System.out.println(i);
		}

		System.out.println("---------------------");
		// Rimuovi tutti gli studenti minori di 20 anni.

		listStudenti.removeIf(s -> s.getEta() < 20);
		listStudenti.forEach(System.out::println); // method reference: solo sirve cuando ya existe un metodo que puedes
													// usar tal cual

		System.out.println("---------------------");
		// Trova e stampa lo studente con età minore.
		Studente minore = Collections.min(listStudenti, Comparator.comparing(Studente::getEta));
		System.out.println("Studenti con la età minore è: " + minore);
	}

}
