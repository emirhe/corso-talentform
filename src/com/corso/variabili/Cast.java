package com.corso.variabili;

public class Cast {

	public static void main(String[] args) {
		
		//----- Esempio -------
		//Cast Implicito
		int number = 3;
		float numbers = number;
		
		//Cast Explicito
		double d1 = 100;
		float f1 = (float)d1;		
		
				
		//----- Exercise ------
					
		//cast implicito
				
		byte byteUno = 1;
		short byteToshort = byteUno;		
		
		short shortUno = 2;
		int shortToInt = shortUno;		
		
		
		char letra = 'A';
		int codigoLetra = letra;
		
		int intNumber = 56;
		long longNumberDos = intNumber;	
		
		long longNumber = 545454544545L;
		float floatNumber = longNumber;
		
		
		//cast explicito
		double doubleNumber = 56.25;
		int intNumberDos = (int) doubleNumber;
		
		float floatNumberDos = 56464f;
		int intNumberTres = (int) floatNumberDos;
		
		int codigoLetraDos = 66;
		char letraDos = (char) codigoLetraDos;
		
			
			
		System.out.println("CAST IMPLICITO:");
		System.out.println("Variabile tipo byte: " + byteUno);
		System.out.println("Cast byte -> short: " + byteToshort);
		System.out.println("------");
		
		System.out.println("Variabile tipo short: " + shortUno);
		System.out.println("Cast short -> int: " + shortToInt);
		System.out.println("------");
		
		System.out.println("Variabile tipo char: " + letra);
		System.out.println("Cast char -> int: " + codigoLetra);
		System.out.println("------");
		
		System.out.println("Variabile tipo long: " + longNumber);
		System.out.println("Cast long -> float: " + floatNumber);
		System.out.println("\n");
		
		System.out.println("CAST EXPLICITO:");
		System.out.println("Variabile tipo double: " + doubleNumber);
		System.out.println("Cast double -> int: " + intNumberDos);
		System.out.println("------");
		
		System.out.println("Variabile tipo float: " + floatNumber);
		System.out.println("Cast float -> int: " + intNumberTres);
		System.out.println("------");
		
		System.out.println("Variabile tipo int: " + codigoLetraDos);
		System.out.println("Cast int -> char: " + letraDos);
		System.out.println("------");

	}

}
