package com.corso.poo.abstracts.programmauno;

public class AppWeb extends PreventivoAppWeb {

	private String mockup;
	private String docFunzionale;
	private String responsiveApp;
	private String appleStore;
	private String multiLanguage;
	private String apiService;
	private String waitingTimes;
	private String waitingTimesTest;
	private String deployApp;

	// new atributi
	private int giornateMockup;
	private int giornateResponsiveApp;
	private int giornatePubblicazioneApp;
	private int giornateFunzioniGeneriche;
	private int giornateDati;
	private int tariffaGiornaliera;

	@Override
	public int getPrezzoGrafiche() {
		return tariffaGiornaliera * giornateMockup;
	}

	@Override
	public int getPrezzoResponsiveApp() {
		return tariffaGiornaliera * giornateResponsiveApp;
	}

	@Override
	public int getPrezzoPubblicazioneApp() {
		return tariffaGiornaliera * giornatePubblicazioneApp;
	}

	@Override
	public int getPrezzoFunzioniGeneriche() {
		return tariffaGiornaliera * giornateFunzioniGeneriche;
	}

	@Override
	public int getPrezzoGestioneDati() {
		return tariffaGiornaliera * giornateDati;
	}

	@Override
	public String getMockup() {
		return mockup;
	}

	@Override
	public String getDocFunzionale() {
		return docFunzionale;
	}

	@Override
	public String getAppleStore() {
		return appleStore;
	}

	@Override
	public String getResponsiveApp() {
		return responsiveApp;
	}

	@Override
	public String getApiService() {
		return apiService;
	}

	@Override
	public String getWaitingTimes() {
		return waitingTimes;
	}

	@Override
	public String getMultiLanguages() {
		return multiLanguage;
	}

	@Override
	public String getWaitingTimesTest() {
		return waitingTimesTest;
	}

	// Metodo della clase
	public int getTotalePreventivo() {
		return getPrezzoGrafiche() + getPrezzoResponsiveApp() + getPrezzoPubblicazioneApp()
				+ getPrezzoFunzioniGeneriche() + getPrezzoGestioneDati();
	}

	// Setters
	public void setMockup(String mockup) {
		this.mockup = mockup;
	}

	public void setDocFunzionale(String docFunzionale) {
		this.docFunzionale = docFunzionale;
	}

	public void setResponsiveApp(String responsiveApp) {
		this.responsiveApp = responsiveApp;
	}

	public void setAppleStore(String appleStore) {
		this.appleStore = appleStore;
	}

	public void setMultiLanguage(String multiLanguage) {
		this.multiLanguage = multiLanguage;
	}

	public void setApiService(String apiService) {
		this.apiService = apiService;
	}

	public void setWaitingTimes(String waitingTimes) {
		this.waitingTimes = waitingTimes;
	}

	public void setWaitingTimesTest(String waitingTimesTest) {
		this.waitingTimesTest = waitingTimesTest;
	}

	public void setGiornateMockup(int giornateMockup) {
		this.giornateMockup = giornateMockup;
	}

	public void setGiornateResponsiveApp(int giornateResponsiveApp) {
		this.giornateResponsiveApp = giornateResponsiveApp;
	}

	public void setGiornatePubblicazioneApp(int giornatePubblicazioneApp) {
		this.giornatePubblicazioneApp = giornatePubblicazioneApp;
	}

	public void setGiornateFunzioniGeneriche(int giornateFunzioniGeneriche) {
		this.giornateFunzioniGeneriche = giornateFunzioniGeneriche;
	}

	public void setGiornateDati(int giornateDati) {
		this.giornateDati = giornateDati;
	}

	public void setTariffaGiornaliera(int tariffaGiornaliera) {
		this.tariffaGiornaliera = tariffaGiornaliera;
	}

	public void setDeployApp(String deployApp) {
		this.deployApp = deployApp;
	}

	public String getDeployApp() {
		return deployApp;
	}

}
