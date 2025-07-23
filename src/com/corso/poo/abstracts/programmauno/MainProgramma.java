package com.corso.poo.abstracts.programmauno;

public class MainProgramma {

	public static void main(String[] args) {

		AppWeb appOops = new AppWeb();

		appOops.setMockup("Sviluppo di 30 mockups per il progetto WebApp Oops");
		appOops.setDocFunzionale("Il progetto WebApp Oops gestisce la pianificazione e l'obbietivo");
		appOops.setResponsiveApp("Il progetto dovrà essere disponibile su piattaforma mobile e web");
		appOops.setMultiLanguage("Il progetto prevede la traduzione delle lingue italiano-inglese");
		appOops.setApiService("Il servizio Api disponibile https://api.oops.com");
		appOops.setWaitingTimes("La richiesta della consegna è prevista a 90 giorni dall'avvio del progetto");
		appOops.setWaitingTimesTest("La fase di test è prevista di circa 5 giorni");
		appOops.setAppleStore("Il cliente dovrà fornire i referimenti");
		appOops.setDeployApp("L'hosting di riferimento per il deploy della WebApp è Firebase");

		System.out.println(appOops.getMockup());
		System.out.println(appOops.getDocFunzionale());
		System.out.println(appOops.getResponsiveApp());
		System.out.println(appOops.getMultiLanguages());
		System.out.println(appOops.getApiService());
		System.out.println(appOops.getWaitingTimes());
		System.out.println(appOops.getWaitingTimesTest());
		System.out.println(appOops.getAppleStore());
		System.out.println(appOops.getDeployApp());

		appOops.setGiornateMockup(30);
		appOops.setGiornateDati(20);
		appOops.setGiornateFunzioniGeneriche(10);
		appOops.setGiornatePubblicazioneApp(2);
		appOops.setGiornateResponsiveApp(5);
		appOops.setTariffaGiornaliera(250);

		System.out.println("Totale preventivo: " + appOops.getTotalePreventivo());

	}

}
