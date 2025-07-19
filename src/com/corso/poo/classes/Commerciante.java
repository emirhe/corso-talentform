package com.corso.poo.classes;

public class Commerciante {

	int redditoAnnuoLordo;
	int coeffRedd;
	int importoInps;
	int aliquotaIrpef;

	public int getUtileTasse() {

		return redditoAnnuoLordo * coeffRedd / 100;

	}

	public int getTassaIrpef() {

		return getUtileTasse() * aliquotaIrpef / 100;
	}

	public int getRedditoNettoMensile() {

		return (redditoAnnuoLordo - (getTassaIrpef() + importoInps)) / 12;

	}

	public void setRedditoAnnuoLordo(int redditoAnnuoLordo) {
		this.redditoAnnuoLordo = redditoAnnuoLordo;
	}

	public void setCoeffRedd(int coeffRedd) {
		this.coeffRedd = coeffRedd;
	}

	public void setTassaInps(int importoInps) {
		this.importoInps = importoInps;
	}

	public void setTassaIrpef(int aliquotaIrpef) {
		this.aliquotaIrpef = aliquotaIrpef;
	}

}
