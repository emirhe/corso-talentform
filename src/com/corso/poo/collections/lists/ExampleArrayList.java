package com.corso.poo.collections.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleArrayList {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();

		numbers.add(8);
		numbers.add(5);
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);

		// ordinamento
		Collections.sort(numbers);

		for (Integer num : numbers) {
			System.out.print(num + "/");
		}

		System.out.println("-----");
		System.out.println("Qual è la dimensione della lista? " + numbers.size());

		numbers.remove(4);

		System.out.println("Qual è la nuova dimensione della lista dopo il remove? " + numbers.size());

		numbers.clear();
		System.out.println("La lista è vuota?: " + numbers.isEmpty());

		System.out.println("------------");

		List<String> nombres = new ArrayList<>();

		nombres.add("Laura");
		nombres.add("Noe");
		nombres.add("Juan");
		nombres.add("Roman");

		Collections.reverse(nombres);

		for (String i : nombres) {
			System.out.println(i);
		}

		System.out.println("------");
		nombres.set(2, "Lucas");

		for (String i : nombres) {
			System.out.println(i);
		}

		System.out.println("-------------------------------------");

		List<Integer> numberList = new ArrayList<>();
		// aggiungeri numeri impari
		numberList.add(1);
		numberList.add(3);
		numberList.add(5);
		numberList.add(7);
		numberList.add(9);
		numberList.add(11);

		// aggiungere numeri pari
		numberList.add(1, 2);
		numberList.add(3, 4);
		numberList.add(5, 6);
		numberList.add(7, 8);
		numberList.add(9, 10);

		System.out.println(numberList);
		System.out.println(numberList.size());

	}

}
