package com.corso.poo.classes;

public class NewFrelancer {

	public int redditoAnnoLordo;
	public int coefRedditivita;
	public int aliquotaInps;
	public int aliquotaIrpef;

	// getters and setters

	public void setRedditoAnnoLordo(int redditoAnnoLordo) {
		this.redditoAnnoLordo = redditoAnnoLordo;
	}

	public void setCoefRedditivita(int coefRedditivita) {
		this.coefRedditivita = coefRedditivita;
	}

	public void setAliquotaInps(int aliquotaInps) {
		this.aliquotaInps = aliquotaInps;
	}

	public void setAliquotaIrpef(int aliquotaIrpef) {
		this.aliquotaIrpef = aliquotaIrpef;
	}

	// metodi speciali della class

	public int getUtileCalcTasse() {
		return redditoAnnoLordo * coefRedditivita / 100;
	}

	public int getTassaInps() {
		return getUtileCalcTasse() * aliquotaInps / 100;
	}

	public int getTassaIrpef() {
		return getUtileCalcTasse() * aliquotaIrpef / 100;
	}

	public int getStipendioNettoMese() {
		return (redditoAnnoLordo - (getTassaInps() + getTassaIrpef())) / 12;
	}

}
