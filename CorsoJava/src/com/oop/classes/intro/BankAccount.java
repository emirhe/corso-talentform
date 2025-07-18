package com.oop.classes.intro;

public class BankAccount {
	
	
	// ATTRIBUTI DELLA CLASSE
	
	public int balance;
	public int firstDeposit;
	public int firstDraw;
	public int secondDeposit;
	public int secondDraw;
	
	
     
	// METODI DELLA CLASSE
	
	
	public int getFirstDeposit() {
		
		
	  return balance + firstDeposit;	
		
	}
	
	public int getFirstDraw() {
		
		
		return getFirstDeposit() - firstDraw;
		
	
		
	}
	
	public int getSecondDeposit() {
		
		
		  return getFirstDraw() + secondDeposit;	
			
		}
	
	
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setFirstDeposit(int firstDeposit) {
		this.firstDeposit = firstDeposit;
	}

	public void setFirstDraw(int firstDraw) {
		this.firstDraw = firstDraw;
	}

	public void setSecondDeposit(int secondDeposit) {
		this.secondDeposit = secondDeposit;
	}

	public void setSecondDraw(int secondDraw) {
		this.secondDraw = secondDraw;
	}

	public int getTotalAccount() {
		
		
		
		return getSecondDeposit()- secondDraw;
		
		
	}
	
	

	public static void main(String[] args) {
		
		
		
		BankAccount account = new BankAccount();
		account.setBalance(0);
		account.setFirstDeposit(500);
		account.setFirstDraw(100);
		account.setSecondDeposit(50);
		account.setSecondDraw(100);
		account.
		

		  System.out.println(account.getTotalAccount());

	}

}
