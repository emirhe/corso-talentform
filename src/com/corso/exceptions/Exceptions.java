package com.corso.exceptions;

public class Exceptions {

	public static void main(String[] args) {

//		int a = 4;
//		int b = 0;
//		int c = a / b;
//
//		System.out.println("risultato: " + c);

		// ArithmeticException
		try {
			int c = 4 / 0;
		} catch (ArithmeticException e) {
			System.out.println("non si puo usare un divisore 0");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Exception gestita");
		}

//		String[] names = { "John", "Frank", "Kate", "Joe" };
//		System.out.println(names[4]);
//		

		// ArrayIndexOutOfBoundsException
		System.out.println("--------------------------");
		try {
			String[] names = { "John", "Frank", "Kate", "Joe" };
			System.out.println(names[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("indice fuori rango");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Exception gestita");
		}

		System.out.println("--------------------------");
		// Null pointer exception

//		String testo = null;
//		System.out.println(testo.length());

		// NullPointerException
		try {
			String testo = null;
			System.out.println(testo.length());
		} catch (NullPointerException e) {
			System.out.println("la variable string ha valore nullo");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Exception gestita");
		}

		System.out.println("--------------------------");
		// NumberFormatException
		try {
			String number = "dd123";
			int valore = Integer.parseInt(number);
			System.out.println(valore);
		} catch (NumberFormatException e) {
			System.out.println("non si puo convertire");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Exception gestita");
		}

		System.out.println("--------------------------");
		// parseInt
		String testo = "123";
		int numeroT = Integer.parseInt(testo);
		System.out.println("uso del parseInt = " + numeroT + 10);

		// InputMismatchException
	}

}
