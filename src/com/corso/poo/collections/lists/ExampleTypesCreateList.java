package com.corso.poo.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExampleTypesCreateList {

	public static void main(String[] args) {

		// Tipo ArrayList
		/*
		 * Modificable en tamano: Si, Permite null: si orden garantizado, duplicado, uso
		 * comun: Lista vacía para agregar elementos
		 */

		ArrayList<Integer> nums = new ArrayList<>(); // sintaxis

		// LinkedList
		/*
		 * Modificable en tamano: Si, Permite null: si orden garantizado, duplicado, uso
		 * comun: Lista vacía para agregar elementos
		 */

		LinkedList<Integer> numer = new LinkedList<>(); // sintaxis

		// Lista fija (basada en array)
		/*
		 * Modificable en tamano: No, Permite null: si orden garantizado, duplicados,
		 * uso comun: Crear una lista rápida y pequeña
		 */

		List<String> frutas = Arrays.asList("Manzana", "Pera", "Durazno", "Sandia"); // sintaxis

		// Lista inmutable- no acepta null
		/*
		 * Modificable en tamano: No, Permite null: no, orden garantizado, duplicado,
		 * uso comun: Crear lista constante, segura
		 */
		List<String> lista = List.of("A", "B"); // sintaxis

		// Lista copia inmutable
		/*
		 * 
		 */
		List<String> original = List.of("A", "B");
		List<String> copia = List.copyOf(original);

		// Lista inmutable y vacia
		/*
		 * Modificable en tamano: No Permite null: si
		 */
		List<String> listaVacia = Collections.emptyList();

	}

}
