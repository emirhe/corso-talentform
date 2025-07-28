package com.corso.poo.abstraction;

public class Motorino extends Veicoli {

	int cilindrate;
	String marchio;

	public Motorino() {
	}

	public Motorino(String targa, String colore, int annoInmatricolazion, Propietario propVeicolo, int cilindrate,
			String marchio) {
		super(targa, colore, annoInmatricolazion, propVeicolo);
		this.cilindrate = cilindrate;
		this.marchio = marchio;
	}

	@Override
	public void run() {
		System.out.println("Utiliza 2 ruote per andare");
	}

	public int getCilindrate() {
		return cilindrate;
	}

	public void setCilindrate(int cilindrate) {
		this.cilindrate = cilindrate;
	}

	public String getMarchio() {
		return marchio;
	}

	public void setMarchio(String marchio) {
		this.marchio = marchio;
	}

}
