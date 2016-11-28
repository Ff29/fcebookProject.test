package com.facebookProject.fcebookProject.test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class Scenario005 extends WebDriverFactory {

	@Test
	public void verifyTradeMarkPage() throws IOException, InterruptedException{
		
		Page001 pageOne = new Page001();
		
		pageOne.clickOnAdChoicesLink();
		pageOne.hoverOverToPoliciesAndTrademark();
		Util.waitOn();
		pageOne.verifyTrademarkPage("How can I adjust how ads are targeted to me based on my activity off of Facebook? | Facebook Help Center | Facebook");
	}
	
}
