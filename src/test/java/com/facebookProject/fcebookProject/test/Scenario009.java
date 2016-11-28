package com.facebookProject.fcebookProject.test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class Scenario009 extends WebDriverFactory {

	@Test
	public void verifyInvalidLogin() throws IOException, InterruptedException{
		
		Page001 pageOne = new Page001();
		pageOne.enterEmail("5551235678");
		pageOne.enterPassword("12345678");
		pageOne.clickOnLogIn();
		pageOne.enterExpectedErrorMessage("The email or phone number you’ve entered doesn’t match any account. Sign up for an account.");
		
		
	}
}
