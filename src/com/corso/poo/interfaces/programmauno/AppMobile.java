package com.corso.poo.interfaces.programmauno;

public class AppMobile implements IRequisitiApp {

	private String mockup;
	private String releaseApp;
	private String multiLanguagesApp;
	private String responsiveApp;

	public AppMobile(String mockup, String releaseApp, String multiLanguagesApp, String responsiveApp) {
		this.mockup = mockup;
		this.releaseApp = releaseApp;
		this.multiLanguagesApp = multiLanguagesApp;
		this.responsiveApp = responsiveApp;
	}

	@Override
	public String getMockup() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getReleaseApp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMultilanguageApp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getResponsiveApp() {
		// TODO Auto-generated method stub
		return null;
	}

}
