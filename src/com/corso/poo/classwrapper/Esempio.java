package com.corso.poo.classwrapper;

import java.util.ArrayList;

public class Esempio {

	public static void main(String[] args) {
		/*
		 * Wrapper Class son la version objeto de los tipos primitivos son utiles para
		 * trabajar con estructuras de datos, porque las collections usan objetos
		 * 
		 * En pocas palabras las clases wrapper son clases que envuelven(wrap) a los
		 * tipos primitivos y los convierten en objetos. ejemplo: int -> Integer
		 */

		// Example Boxing: convertir un tipo primitivo a su clase wrapper
		int var1 = 10;
		Integer box = Integer.valueOf(var1);

		// Example Autoboxing: lo mismo que boxing per Java lo hace automaticamente
		int var2 = 10;
		Integer box2 = var2;

		// Unboxing: lo contrario, sacas el valor primitivo de la clase wrapper
		Integer box3 = Integer.valueOf(10);
		int var3 = box3.intValue(); // Unboxing manual

		// Auto-unboxing
		Integer box4 = 10;
		int numero = box4; // Auto-unboxing

		// Metodos utiles
		boolean var4 = Boolean.parseBoolean("false"); // String -> false boolean
		int num = Integer.parseInt("4"); // String -> int

		// Examples
		ArrayList<Integer> lista = new ArrayList<>();
		int x = 5; // tipo primitivo
		lista.add(x); // Autoboxing (int -> Integer)
		int y = lista.get(0); // Auto-unboxing (Integer -> int)

		// Ejercicios

		/*
		 * Dichiara un oggetto Double e assegna il suo valore a una variabile double
		 * primitiva. *
		 */
		Double oggDouble = 3.15;
		double numdouble = oggDouble;

		/*
		 * Converti la stringa "123" in un int usando il metodo statico di Integer.
		 */
		String numString = "123";
		int numInt = Integer.parseInt(numString);

		/*
		 * Dichiara una variabile int e assegnala a un oggetto Integer usando
		 * l'autoboxing.
		 */
		int valore = 5;
		Integer valoreInteger = valore;

		/*
		 * Converti la stringa "45" in un oggetto Integer.
		 */
		String numText = "45";
		int numL = Integer.valueOf(numText);

		/*
		 * Crea due oggetti Integer con valore 1000 e verifica se sono uguali usando ==
		 * e .equals().
		 */
		Integer valA = 1000;
		Integer valB = 1000;

		// Usando == compara los objetos que obviamente son diferentes
		if (valA == valB) {
			System.out.println("Sono uguali");
		} else {
			System.out.println("Non sono uguali");
		}

		// usando equals -> compara su contenido
		if (valA.equals(valB)) {
			System.out.println("Sono uguali");
		} else {
			System.out.println("Non sono uguali");
		}
		System.out.println("---------------------------");

		/* Converti un int in String usando Integer.toString. */
		int numConvertir = 6;
		String numConvertTex = Integer.toString(numConvertir);
		System.out.println(numConvertTex);

		System.out.println("---------------------------");

		/* Converte la stringa "127" in un oggetto Byte. */
		String numByteString = "127";
		Byte numByte = Byte.valueOf(numByteString);
		System.out.println(numByte);

		System.out.println("---------------------------");

		/* Verifica se il carattere '9' è una cifra numerica. */
		Character numCharacter = '9';
		boolean verificaChar = Character.isDigit(numCharacter);
		System.out.println(verificaChar);

		/* Converte la stringa "true" in un valore boolean. */
		String trueString = "true";
		boolean trueBoolean = Boolean.parseBoolean(trueString);

		System.out.println("---------------------------");

		// Converti la stringa "3.14" in un valore float
		String floatString = "3.14";
		float convertFloat = Float.parseFloat(floatString);
		System.out.println(convertFloat);

		System.out.println("---------------------------");

		// Confronta due valori Double usando Double.compare
		Double valoreUno = 5.6;
		Double valoreDue = 6.3;
		double confronto = Double.compare(valoreUno, valoreDue);
		System.out.println(confronto);

		System.out.println("---------------------------");

		// Crea un array di oggetti Integer con i valori da 1 a 5.
		Integer[] arrayIntegers = { 1, 2, 3, 4, 5 };
		for (Integer i : arrayIntegers) {
			System.out.println(i);
		}

		System.out.println("---------------------------");

		// Converte la stringa "12345" in un oggetto Short.

		String shortString = "12345";
		short convertShort = Short.parseShort(shortString);

		// Converte un oggetto Integer in una stringa tramite concatenazione.

		Integer elementoInteger = 566;
		String elementoString = "" + elementoInteger;
		System.out.println(elementoString);
		String provaString = "";

		System.out.println(provaString);
		System.out.println("hola");

	}

}
