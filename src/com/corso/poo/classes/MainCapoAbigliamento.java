package com.corso.poo.classes;

public class MainCapoAbigliamento {

	public static void main(String[] args) {

		CapoAbigliamento tshirt = new CapoAbigliamento("billabong", "ocean", 25.5);

		System.out.println(tshirt.toString());

		System.out.println("Apllicazione dello sconto: €" + tshirt.aplicaSconto(15));

		tshirt.modificaCosto(tshirt.aplicaSconto(15));

		System.out.println("nuovo prezzo aplicando lo sconto: €" + tshirt.costo);

	}

}
