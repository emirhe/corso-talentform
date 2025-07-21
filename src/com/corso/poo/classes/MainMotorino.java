package com.corso.poo.classes;

public class MainMotorino {

	public static void main(String[] args) {

		Motorino modelloI = new Motorino("Rosso", 0.0f, "MBK Booster", false);

		System.out.println("Colore motorino: " + modelloI.colore);
		modelloI.accelera(50.0f);

		modelloI.setAntifurto(true);

		modelloI.accelera(1.0f);

		MotorinoImmatricolato motorinoImmatricolato = new MotorinoImmatricolato("Black", 20, "LPW", false, 60,
				"LL4848");
		motorinoImmatricolato.accelera(30);

	}

}
