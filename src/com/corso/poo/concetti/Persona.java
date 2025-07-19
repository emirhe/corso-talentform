package com.corso.poo.concetti;

public class Persona {

	// atributi della class
	String name;
	String surname;
	String city;
	String nation;

	// constructor vacio para instanciar sin inicializacion
	public Persona() {
		super();
	}

	// constructors
	public Persona(String name, String surname, String city, String nation) {
		super();
		this.name = name;
		this.surname = surname;
		this.city = city;
		this.nation = nation;
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public static void main(String[] args) {

		// inizializazione del costructore e dell'ogetto o variabile di istanza
		Persona usuario = new Persona();

		usuario.setName("Emir");
		usuario.setSurname("Hernandez");
		usuario.setCity("Parma");
		usuario.setNation("Italy");

		System.out.println(usuario.getName());
		System.out.println(usuario.getSurname());
		System.out.println(usuario.getCity());
		System.out.println(usuario.getNation());

		Account utenteUno = new Account();
		utenteUno.setBalance(0);

	}
}
