package com.corso.poo.classes;

public class BankAccount {

	// atributti
	public int balance;
	public int firstDeposit;
	public int firstDraw;
	public int secondDeposit;
	public int secondDraw;
	public int impostaBolo;
	public int canoneAnnuo;

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getFirstDeposit() {
		return balance + firstDeposit;
	}

	public void setFirstDeposit(int firstDeposit) {
		this.firstDeposit = firstDeposit;
	}

	public int getFirstDraw() {
		return getFirstDeposit() - firstDraw;
	}

	public void setFirstDraw(int firstDraw) {
		this.firstDraw = firstDraw;
	}

	public int getSecondDeposit() {
		return getFirstDraw() + secondDeposit;
	}

	public void setSecondDeposit(int secondDeposit) {
		this.secondDeposit = secondDeposit;
	}

	public int getSecondDraw() {
		return getSecondDeposit() - secondDraw;
	}

	public void setSecondDraw(int secondDraw) {
		this.secondDraw = secondDraw;
	}

	public void setImpostaBolo(int impostaBolo) {
		this.impostaBolo = impostaBolo;
	}

	public void setCanoneAnnuo(int canoneAnnuo) {
		this.canoneAnnuo = canoneAnnuo;
	}

	public int getTotalImpostaBolo() {
		return getSecondDraw() - impostaBolo;
	}

	public int getTotalCanonePagamento() {
		return getTotalImpostaBolo() * canoneAnnuo / 100;
	}

	public int getTotalAccount() {
		return getTotalImpostaBolo() - getTotalCanonePagamento();
	}

}
