package com.corso.poo.classes;

public class MainCommerciante {

	public static void main(String[] args) {

		Commerciante reddito = new Commerciante();
		reddito.setRedditoAnnuoLordo(125000);
		reddito.setCoeffRedd(40);
		reddito.setTassaInps(3500);
		reddito.setTassaIrpef(15);

		System.out.println("Reddito mensile annuo: €" + reddito.getUtileTasse());
		System.out.println("Reddito mensile annuo: €" + reddito.getTassaIrpef());
		System.out.println("Reddito mensile annuo: €" + reddito.getRedditoNettoMensile());

	}

}
