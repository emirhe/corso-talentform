package com.corso.poo.classes;

public class Dipendente {

	private int oreLavorate;
	private int retribuzioneOraria;

	public Dipendente(int oreLavorate, int retribuzioneOraria) {
		this.oreLavorate = oreLavorate;
		this.retribuzioneOraria = retribuzioneOraria;
	}

	// metodi

	public int getStipendio() {
		return oreLavorate * retribuzioneOraria;
	}

	public int getOreLavorate() {
		return getStipendio() / retribuzioneOraria;
	}

	public int getRetribuzioneOraria() {
		return getStipendio() / oreLavorate;
	}

}
