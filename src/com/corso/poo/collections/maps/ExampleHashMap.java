package com.corso.poo.collections.maps;

import java.util.HashMap;

public class ExampleHashMap {

	public static void main(String[] args) {

		HashMap<String, String> paises = new HashMap<>();
		paises.put("MX", "México");
		paises.put("IT", "Italia");
		paises.put("FR", "Francia");

		System.out.println(paises.get("IT")); // Italia

		// Recorrer por claves
		for (String clave : paises.keySet()) {
			System.out.println("Clave: " + clave);
		}

		// Recorrer por valores
		for (String valor : paises.values()) {
			System.out.println("Valor: " + valor);
		}

		// Recorrer por pares clave-valor
		for (HashMap.Entry<String, String> entrada : paises.entrySet()) {
			System.out.println(entrada.getKey() + " -> " + entrada.getValue());
		}

		// Verificar si existe
		if (paises.containsKey("FR")) {
			System.out.println("Sí contiene a Francia");
		}

		// Eliminar
		paises.remove("MX");

		System.out.println(paises);
	}

}
