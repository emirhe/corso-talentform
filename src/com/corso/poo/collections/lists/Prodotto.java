package com.corso.poo.collections.lists;

import java.util.ArrayList;

public class Prodotto {

	public String nome;
	public double prezzo;
	public String descrizione;

	public Prodotto(String nome, double prezzo, String descrizione) {
		this.nome = nome;
		this.prezzo = prezzo;
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		return "Prodotto [ " + nome + "/" + prezzo + "/" + descrizione + "]";
	}

	public static void main(String[] args) {

		ArrayList<Prodotto> prodotti = new ArrayList<>();

		prodotti.add(new Prodotto("Lapiz HB", 1.2, "Lapiz de dibujo"));
		prodotti.add(new Prodotto("Cuaderno", 4.3, "Cuaderno de dibujo"));
		prodotti.add(new Prodotto("Folder", 3.5, "Folder de plastico"));
		prodotti.add(new Prodotto("Calculadora", 22.5, "Calculadora cientifica"));

		for (Prodotto i : prodotti) {
			System.out.println(i.toString());
		}

		double somma = 0;
		for (Prodotto i : prodotti) {
			somma += i.prezzo;
		}

		System.out.println("La somma dei prezzi di tutti i prodotti è: " + somma);
	}

}
