package com.facebookProject.fcebookProject.test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class Scenario004 extends WebDriverFactory {

	@Test
	public void listOfWesternEuropeLanguages() throws IOException, InterruptedException{
		
		Page001 pageOne = new Page001();
		
		pageOne.clickOnMoreLanguages();
		pageOne.clickOnwesternEuropeLanguages();
		pageOne.listOfWesternEuropeLanguages();
	}
}
