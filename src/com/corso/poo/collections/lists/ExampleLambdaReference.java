package com.corso.poo.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleLambdaReference {

	public static void main(String[] args) {

		/*
		 * creacion e inicializacion una lista de forma rapida Arrays.asList(..) : es un
		 * metodo estatico de la clase Arrays recibe varios elementos y los convierte en
		 * una lista fija que no se puede modificar en tamano El tipo de lista que
		 * devuelve no es un ArrayList, si no una lista especial basada en arrays
		 * internos
		 * 
		 * List<String> frutas : estamos declarando una lista de cadenas(String) llamada
		 * frutas
		 * 
		 * No es un ArrayList - tiene limitaciones. No se pueden agregar ni eliminar
		 * elementos
		 */

		List<String> frutas = Arrays.asList("Manzana", "Pera", "Durazno", "Sandia");

		// usando lambda
		frutas.forEach(fruta -> System.out.println("Fruta: " + fruta));

		// usando method reference
		frutas.forEach(System.out::println);

		System.out.println("-------------------");

		// creacion una lista modificable desde 0 - forma rapida

		List<String> nombres = new ArrayList<>(Arrays.asList("Maria", "Juan", "Lourdes", "Karen"));

		nombres.forEach(System.out::println);

		nombres.add("Sara");

		System.out.println("-------------------");
		nombres.forEach(System.out::println);

	}

}
