package com.corso.poo.abstraction;

public class Bat extends Animal implements Iflying {

	@Override
	public void sound() {
		System.out.println("gni gni");

	}

	@Override
	public void fly() {
		System.out.println("El murcielago esta volando");

	}

}
