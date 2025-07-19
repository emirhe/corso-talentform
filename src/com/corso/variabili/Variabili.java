package com.corso.variabili;

import java.util.Scanner;

public class Variabili {

	public static void main(String[] args) {
		
		/*  ---- variable (primitive types) ----
		 * Son los mas basicos. No son objetos, no tienen metodos. Solo almacen valor puro.
		 * son mas rapidos
		 * Ocupan menos memoria
		 * No se pueden llamar metodos sobre ellos
		 * No se pueden usar colecciones como ArrayList
		 * */
		
		//int
		int number = 10;
		
		//boolean
		boolean started = true;
		
		//char
		char symbol = 'a';
		
		/* long
		 * Usar L o l al final, cuando excede el rango de int 
		 * */
		long pIvaEmir = 78954564456L;
		
		//double
		double decimal = 30.5;
		
		//float
		float numbers = 10.32f;
		
		/* ---- variable (reference types) ----
		 * Son objetos creados a partir de clases
		 * alamacenan una referencia (direccion en memoria) al objeto, no el valor directo
		 * se pueden usar en colecciones
		 * */ 
		
		//String
		String name = "Emir";
		
		//Scanner
		Scanner tecladoScanner = new Scanner(System.in);
		
		//Integer
		Integer edad = 25;
		
		// ---- sintax ----
		
		/*variable & methods  -> 
		 * deben empezar con letra y siempre en minuscula
		 * no pueden empezar con numeros
		 * no palabras reservadas
		 * camelCase
		 * */ 
		
		// class -> inicial mayuscula "Clase" y despues uso de camelCase
					
			
		//----- Exercise ------
		
		//3 variabili di tipo primitivo
		int id = 2;
		double alteza = 1.68;
		boolean registrato = true;
		
		//2 tipo String
		String cognome = "Hernandez";
		String residenza = "Parma";
		String corso = "Java-Web";
		
		//assegnazione per riferimento
		int code = id; 
		String citta = residenza;
				
		
		//println
		System.out.println("Variabili tipo Primitivo: " + id +", "+ alteza +", "+ registrato);
		System.out.println("Variabili tipo String: " + cognome +", "+ residenza +", "+ corso);
		System.out.println("Assegnazione: " + code +" " + citta);
		
		System.out.println("Inserisci il tuo nome");
		String nome = tecladoScanner.nextLine();
		
		System.out.println("Haz ingresado el siguiente nombre: " + nome);
		

	}

}
