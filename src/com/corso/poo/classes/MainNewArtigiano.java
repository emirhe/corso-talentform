package com.corso.poo.classes;

public class MainNewArtigiano {

	public static void main(String[] args) {

		NewArtigiano artigianoI = new NewArtigiano();

		artigianoI.setRedditoAnnuoLordo(90000);
		artigianoI.setCoeffRedd(67);
		artigianoI.setImportoInps(3500);
		artigianoI.setAliquotaInps(24);
		artigianoI.setAliquotaIrpef(15);
		artigianoI.setImportoEccedente(15000);

		System.out.println("Guagno netto mensile: €" + artigianoI.calcoloGuadagnoNettoMensile());

	}

}
