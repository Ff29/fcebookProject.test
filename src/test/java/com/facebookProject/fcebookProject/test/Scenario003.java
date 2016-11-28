package com.facebookProject.fcebookProject.test;
import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.facebookProject.fcebookProject.test.Page001;
import com.facebookProject.fcebookProject.test.WebDriverFactory;

@Listeners(Listener.class)
public class Scenario003 extends WebDriverFactory{

	@Test
	public void verifyAdSettingsPage() throws IOException, InterruptedException{
		
		
		
		
		Page001 pageOne = new Page001();
		pageOne.clickOnCookies();
		pageOne.clickOnHowToControlCookies();
		
		pageOne.clickOnIfHaveFbAccount();
		pageOne.clickOnAdSettings();
		pageOne.enterAdSettingsPageTitle("About the Ads You See From Facebook");
	}
}
