package com.corso.poo.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ExerciseGestioneArrayList {

	private List<Integer> lista;

	public ExerciseGestioneArrayList() {
		this.lista = new ArrayList<>();
	}

	public void inserisci(Integer n) {
		lista.add(n);
	}

	public void canceList() {
		lista.removeIf(i -> i % 2 == 0);
	}

	@Override
	public String toString() {
		return "lista = " + lista + "]";
	}

	public static void main(String[] args) {

		ExerciseGestioneArrayList lista = new ExerciseGestioneArrayList();

		lista.inserisci(2);
		lista.inserisci(1);
		lista.inserisci(6);
		lista.inserisci(3);
		lista.inserisci(10);
		lista.inserisci(11);
		lista.inserisci(18);

		System.out.println(lista.toString());
		lista.canceList();

		System.out.println(lista.toString());

	}

}
