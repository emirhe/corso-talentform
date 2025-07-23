package com.corso.poo.classes;

public class MainImpiegato {

	public static void main(String[] args) {

		Impiegato impiegato = new Impiegato("SDFS50", 1500.0, 12);

		impiegato.stampa();

		System.out.println("Stipendio mensile: €" + impiegato.getStipendio());
		System.out.println("Ore straordinario: " + impiegato.straordinario);

		System.out.println("-------------------------");
		System.out.println("Totale pagamento del mese con extraordinario: €" + impiegato.paga(12));

	}

}
