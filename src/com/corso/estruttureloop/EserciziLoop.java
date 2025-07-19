package com.corso.estruttureloop;

public class EserciziLoop {

	public static void main(String[] args) {

		// comando for ----------------------------------

		// incremento
		for (int index = 1; index < 8; index++) {
			System.out.println(index);
		}

		System.out.println("-----------------------------");

		// dicremento
		for (int i = 80; i > 10; i = i - 10) {
			System.out.println(i);
		}

		System.out.println("-----------------------------");

		// comando for + continue -----------------------

		for (int i = 20; i > 5; i = i - 2) {
			if (i == 10) {
				System.out.println("salto");
				continue;
			}

			System.out.println(i);
		}

		System.out.println("-----------------------------");

		// comando while -----------------------

		int count = 0;
		int sentinel = 10;

		// incremento
		while (count <= sentinel) {
			System.out.println(count);
			count++;
		}

		System.out.println("-----------------------------");

		// nuovi valori alle variabili per realizzare il decremento

		count = 10;
		sentinel = 0;

		// decremento
		while (count >= sentinel) {
			System.out.println(count);
			count = count - 1;
		}
		System.out.println("-----------------------------");

		// comando do-while -----------------------

		int code = 60;

		do {
			System.out.println(code);
			code = code - 1;
		} while (code >= 50);

		System.out.println("-----------------------------");

	}

}
