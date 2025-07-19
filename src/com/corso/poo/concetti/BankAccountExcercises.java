package com.corso.poo.concetti;

public class BankAccountExcercises {

	// Atributi della class

	public int balance;
	public int firstDeposit;
	public int firstDraw;
	public int secondDeposit;
	public int secondDraw;
	public int thirdDeposit;
	public int thirdDraw;

	// Metodo Constructor vuoto della class
	public BankAccountExcercises() {
		super();
	}

	// Metodo Constructor con parametri della class
	public BankAccountExcercises(int balance, int firstDeposit, int firstDraw, int secondDeposit, int secondDraw,
			int thirdDeposit, int thirdDraw) {
		super();
		this.balance = balance;
		this.firstDeposit = firstDeposit;
		this.firstDraw = firstDraw;
		this.secondDeposit = secondDeposit;
		this.secondDraw = secondDraw;
		this.thirdDeposit = thirdDeposit;
		this.thirdDraw = thirdDraw;
	}

	// Metodi Getters and Setters

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getFirstDeposit() {
		return firstDeposit + balance;
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

	public int getThirdDeposit() {
		return thirdDeposit;
	}

	public void setThirdDeposit(int thirdDeposit) {
		this.thirdDeposit = thirdDeposit;
	}

	public int getThirdDraw() {
		return thirdDraw;
	}

	public void setThirdDraw(int thirdDraw) {
		this.thirdDraw = thirdDraw;
	}

}
