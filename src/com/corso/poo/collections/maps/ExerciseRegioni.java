package com.corso.poo.collections.maps;

import java.util.HashMap;

public class ExerciseRegioni {

	private String nome;
	private double longitudine;
	private double latitudine;

	public ExerciseRegioni(String nome, double longitudine, double latitudine) {
		this.nome = nome;
		this.longitudine = longitudine;
		this.latitudine = latitudine;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getLongitudine() {
		return longitudine;
	}

	public void setLongitudine(double longitudine) {
		this.longitudine = longitudine;
	}

	public double getLatitudine() {
		return latitudine;
	}

	public void setLatitudine(double latitudine) {
		this.latitudine = latitudine;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", longitudine=" + longitudine + ", latitudine=" + latitudine + "]\n";
	}

	public static void main(String[] args) {

		HashMap<Integer, ExerciseRegioni> regioni = new HashMap<>();

		regioni.put(1, new ExerciseRegioni("Toscana", 5.6, 8.6));
		regioni.put(2, new ExerciseRegioni("Lombardia", 7.8, 2.3));
		regioni.put(3, new ExerciseRegioni("EmiliaRomagna", 1.8, 2.3));
		regioni.put(4, new ExerciseRegioni("Liguria", 3.0, 0.3));

		System.out.println(regioni.toString());

	}

}
