package com.corso.poo.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ExerciseListOfArrayList {

	public static void main(String[] args) {

		// Crea un ArrayList<ArrayList<Integer>> contenente 3 liste di interi. Stampale.

		ArrayList<ArrayList<Integer>> liste = new ArrayList<>();

		ArrayList<Integer> listOne = new ArrayList<>(List.of(5, 6, 7, 8, 9));
		ArrayList<Integer> listTwo = new ArrayList<>(List.of(10, 11, 12, 13, 14));
		ArrayList<Integer> listThree = new ArrayList<>(List.of(15, 16, 17, 18, 19));

		liste.add(listOne);
		liste.add(listTwo);
		liste.add(listThree);

		// for each classic
		for (ArrayList<Integer> i : liste) {
			System.out.println(i);
		}

		System.out.println("---------------------");

		// method reference
		liste.forEach(System.out::println);

	}

}
