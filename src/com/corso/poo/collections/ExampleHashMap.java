package com.corso.poo.collections;

import java.util.HashMap;

public class ExampleHashMap {

	public static void main(String[] args) {

		HashMap<String, Integer> gruppoMap = new HashMap<>();

		gruppoMap.put("Cuaderno", 222);
		gruppoMap.put("Libro", 232);
		gruppoMap.put("Lapiz", 242);

		System.out.println(gruppoMap.size());
		System.out.println(gruppoMap.containsKey("Revista"));

		System.out.println(gruppoMap.get("Libro"));

		System.out.println(gruppoMap.toString());

	}

}
