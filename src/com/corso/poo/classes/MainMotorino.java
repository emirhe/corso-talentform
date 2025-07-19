package com.corso.poo.classes;

public class MainMotorino {

	public static void main(String[] args) {

		Motorino modelloI = new Motorino("Rosso", 135.0f, "MBK Booster", false);

		System.out.println("Colore motorino: " + modelloI.colore);
		modelloI.accelera(50.0f);

		modelloI.setAntifurto(true);

	}

}
