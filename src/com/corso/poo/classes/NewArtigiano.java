package com.corso.poo.classes;

public class NewArtigiano {

	public int redditoAnnuoLordo;
	public int coeffRedd;
	public int importoInps;
	public int aliquotaIrpef;
	public int aliquotaInps;
	public int importoEccedente;

	public int calcoloUtileTassabile() {
		return redditoAnnuoLordo * coeffRedd / 100;
	}

	public int calcoloIrpef() {
		return calcoloUtileTassabile() * aliquotaIrpef / 100;
	}

	public int calcoloUtileTasseEccedente() {
		return (redditoAnnuoLordo - importoEccedente) * coeffRedd / 100;
	}

	public int calcoloInps() {
		return calcoloUtileTasseEccedente() * aliquotaInps / 100;
	}

	public int calcoloGuadagnoNettoMensile() {
		return (redditoAnnuoLordo - (calcoloInps() + calcoloIrpef() + importoInps)) / 12;
	}

	public void setRedditoAnnuoLordo(int redditoAnnuoLordo) {
		this.redditoAnnuoLordo = redditoAnnuoLordo;
	}

	public void setCoeffRedd(int coeffRedd) {
		this.coeffRedd = coeffRedd;
	}

	public void setImportoInps(int importoInps) {
		this.importoInps = importoInps;
	}

	public void setAliquotaIrpef(int aliquotaIrpef) {
		this.aliquotaIrpef = aliquotaIrpef;
	}

	public void setAliquotaInps(int aliquotaInps) {
		this.aliquotaInps = aliquotaInps;
	}

	public void setImportoEccedente(int importoEccedente) {
		this.importoEccedente = importoEccedente;
	}

}
