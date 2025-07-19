package com.corso.poo.concetti;

public class EsempioClass {

	// Atributi della classe

	// Esempio Programma Banca ---------------------

	private int balance;
	private int firstDeposit;
	private int firstDraw;
	private int secondDeposit;
	private int secondDraw;
	private int thirdDeposit;
	private int thirdDraw;

	// Constructors

	public EsempioClass() {
		super();
	}

	public EsempioClass(int balance, int firstDeposit, int firstDraw, int secondDeposit, int secondDraw) {
		super();
		this.balance = balance;
		this.firstDeposit = firstDeposit;
		this.firstDraw = firstDraw;
		this.secondDeposit = secondDeposit;
		this.secondDraw = secondDraw;
	}

	// metodi della classe

	// getters & setters

	public int getBalance() {
		return balance;
	}

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
		return secondDraw;
	}

	public void setSecondDraw(int secondDraw) {
		this.secondDraw = secondDraw;
	}

	public int getTotalAccount() {
		return getSecondDeposit() - secondDraw;
	}

	// metodo main para ejecutar programa

	public static void main(String[] args) {

		EsempioClass account = new EsempioClass();

		account.setBalance(1000);
		account.setFirstDeposit(50);
		account.setSecondDeposit(500);
		account.setFirstDraw(100);
		account.setSecondDraw(50);

		System.out.println(account.getBalance());
		System.out.println(account.getFirstDeposit());
		System.out.println(account.getFirstDraw());
		System.out.println(account.getSecondDeposit());
		System.out.println(account.getSecondDraw());

	}

}
