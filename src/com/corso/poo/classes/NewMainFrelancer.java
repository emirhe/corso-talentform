package com.corso.poo.classes;

public class NewMainFrelancer {

	public static void main(String[] args) {

		NewFrelancer freelancerI = new NewFrelancer();

		freelancerI.setRedditoAnnoLordo(50000);
		freelancerI.setCoefRedditivita(78);
		freelancerI.setAliquotaInps(26);
		freelancerI.setAliquotaIrpef(15);

		System.out.println("Reditto mensile neto: €" + freelancerI.getStipendioNettoMese());

	}

}
