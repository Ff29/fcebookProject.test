package com.facebookProject.fcebookProject.test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class Scenario010 extends WebDriverFactory {

	@Test
	public void scrollDownnAndLoadPage() throws IOException, InterruptedException{
		
		Page001 pageOne = new Page001();
		
		pageOne.clickOnHelp();
		pageOne.clickOnvisitHelpCommunity();
		Util.scrollDown();
		Util.scrollDown();
	}
}
