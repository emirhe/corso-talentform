package com.corso.array;

import java.util.Arrays;

public class ArrayMultiple {

	public static void main(String[] args) {
		// Costante - non puo cambiare
		final String CODICEF = "DFSFDF098989";
		final Integer TASSA = 50;

		int a;
		int b;
		int c;

		int[][] array2 = new int[4][4];
		System.out.println(Arrays.toString(array2));
		System.out.println("array2.length = " + array2.length);

		for (int[] outer : array2) {
			System.out.println(Arrays.toString(outer));
		}

		for (int i = 0; i < array2.length; i++) {
			var innerArray = array2[i];
			for (int j = 0; j < innerArray.length; j++) {

				array2[i][j] = (i * 10) + (j + 1);
			}

		}

		System.out.println(Arrays.deepToString(array2));

		// variabile - cambiano

		a = 5;
		b = 10;

		c = a + b;

		int d = 30;

		d = 50;

		d = 100;

		c = d + TASSA;

		String nomeString = "Manuela";

		System.out.println(nomeString + CODICEF);

	}
}
