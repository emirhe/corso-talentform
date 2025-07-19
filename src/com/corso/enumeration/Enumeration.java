package com.corso.enumeration;

public class Enumeration {
	enum Colors {
		BLUE, RED, WHITE, BLACK
	}

	public static void main(String[] args) {

		Colors red = Colors.RED;
		Colors blue = Colors.BLUE;
		Colors white = Colors.WHITE;
		Colors black = Colors.BLACK;

		System.out.println("Colors: " + red);
		System.out.println("Colors: " + blue);
		System.out.println("Colors: " + white);
		System.out.println("Colors: " + black);

	}

}
