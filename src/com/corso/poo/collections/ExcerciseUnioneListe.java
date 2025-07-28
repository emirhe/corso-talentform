package com.corso.poo.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ExcerciseUnioneListe {

	public static void main(String[] args) {

		// Data una seconda lista di studenti, uniscila alla prima.

		List<String> grupoUno = new ArrayList<>();

		grupoUno.add("Jose");
		grupoUno.add("Maria");
		grupoUno.add("Maria");
		grupoUno.add("Ramon");

		List<String> grupoDos = new ArrayList<>();

		grupoDos.add("Sara");
		grupoDos.add("Clara");
		grupoDos.add("Francisco");
		grupoDos.add("Francisco");

		grupoUno.addAll(grupoDos);

		// Rimuovi i nomi duplicati da un ArrayList<String>.

		List<String> lista = new ArrayList<>(List.of("Anna", "Anna", "Jose", "Laura", "Laura"));
		System.out.println(lista);

		Set<String> listaSenzaDuplicati = new LinkedHashSet<>(lista);

		lista.addAll(listaSenzaDuplicati);
		System.out.println(listaSenzaDuplicati);

	}

}
