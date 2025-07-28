package com.corso.poo.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ExampleTypesCreateList {

	public static void main(String[] args) {

		// Tipo ArrayList
		/*
		 * Modificable en tamano: Si Permite null: si
		 */

		ArrayList<Integer> nums = new ArrayList<>(); // sintaxis

		// LinkedList
		/*
		 * Modificable en tamano: Si Permite null: Si
		 */

		LinkedList<Integer> numer = new LinkedList<>(); // sintaxis

		// Lista fija (basada en array)
		/*
		 * Modificable en tamano: No Permite null: si
		 */

		List<String> frutas = Arrays.asList("Manzana", "Pera", "Durazno", "Sandia"); // sintaxis

	}

}
