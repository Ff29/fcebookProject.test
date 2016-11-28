package com.facebookProject.fcebookProject.test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class Scenario007 extends WebDriverFactory{

	@Test
	public void submittingFeedback() throws IOException, InterruptedException{
		
		Page001 pageOne = new Page001();
		
		pageOne.clickOnHelp();
		pageOne.enterDataInSearchBox("How do I report a page?");
		pageOne.clickOnEmoji();
		pageOne.enterComment("It was very helpful");
		pageOne.clickOnSubmitButton();
		pageOne.vrifyConfirmationMessage("Thanks! Your feedback helps improve this answer for everyone.");
	}
}
