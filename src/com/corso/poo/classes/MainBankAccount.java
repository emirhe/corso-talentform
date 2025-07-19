package com.corso.poo.classes;

public class MainBankAccount {

	public static void main(String[] args) {

		BankAccount contoI = new BankAccount();

		contoI.setBalance(500);
		contoI.setFirstDeposit(200);
		contoI.setFirstDraw(100);
		contoI.setSecondDeposit(300);
		contoI.setSecondDraw(300);
		contoI.setImpostaBolo(35);
		contoI.setCanoneAnnuo(5);

		System.out.println("Total account first deposit: €" + contoI.getFirstDeposit());
		System.out.println("Total account dopo primo prelievo: €" + contoI.getFirstDraw());

		System.out.println("Total account second deposit: €" + contoI.getSecondDeposit());
		System.out.println("Total account dopo secondo prelievo: €" + contoI.getSecondDraw());

		System.out.println("Salto attuale compresso imposta bolo: €" + contoI.getTotalImpostaBolo());

		System.out.println("Totale a pagare per il canone annuo: €" + contoI.getTotalCanonePagamento());

		System.out.println("Totale conto corrente: €" + contoI.getTotalAccount());

	}

}
