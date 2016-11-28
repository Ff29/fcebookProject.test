package com.facebookProject.fcebookProject.test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class Scenario006 extends WebDriverFactory {

	@Test
	public void playAuthenticateSelfVideo() throws IOException, InterruptedException{
		
		Page001 pageOne = new Page001();
		
		pageOne.clickOnCareer();
		pageOne.clickOnBenefit();
		pageOne.clickOnAuthenticSelfVideo();
		Thread.sleep(10000);
	}
	
}
