package com.corso.poo.abstraction;

public class Bird extends Animal implements Iflying {

	@Override
	public void sound() {
		System.out.println("Pio-Pio");

	}

	@Override
	public void fly() {
		System.out.println("El pajaro esta volando");

	}

}
