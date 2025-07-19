package com.corso.estruttureloop;

public class EstruttureLoop {

	public static void main(String[] args) {

		// while loop

		int i = 0;
		while (i <= 5) {
			System.out.println(i);
			i = i + 1;
		}

		System.out.println("---------------------");

		int countdown = 3;
		while (countdown >= 0) {
			System.out.println(countdown);
			countdown = countdown - 1;
		}

		System.out.println("---------------------");

		// do while loop

		int a = 0;
		do {
			System.out.println(a);
			a++;
		} while (a <= 10);

		System.out.println("---------------------");

		// for
		for (int b = 0; b < 10; b++) {
			System.out.println(b);
		}

		int sum = 0;
		for (int c = 1; c <= 5; c++) {
			sum = sum + c;
		}
		System.out.println("Sum is: " + sum);

	}

}
