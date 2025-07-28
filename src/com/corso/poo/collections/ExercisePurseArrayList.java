package com.corso.poo.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercisePurseArrayList {

	private List<String> listMonete;

	public ExercisePurseArrayList() {
		this.listMonete = new ArrayList<>();
	}

	public void addCoin(String coinName) {
		listMonete.add(coinName);
	}

	@Override
	public String toString() {
		return "Purse" + listMonete;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ExercisePurseArrayList listMonet = new ExercisePurseArrayList();

		System.out.println("Inserisci una moneta");
		System.out.println("Per uscire del programa digita s");

		boolean exit = false;

		while (!exit) {
			String moneta = scan.nextLine();

			if (moneta.equalsIgnoreCase("s")) {
				exit = true;
			} else {
				listMonet.addCoin(moneta);
			}
		}

		System.out.println(listMonet.toString());

	}

}
