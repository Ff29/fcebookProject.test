package com.facebookProject.fcebookProject.test;
import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.facebookProject.fcebookProject.test.Page001;
import com.facebookProject.fcebookProject.test.WebDriverFactory;


@Listeners(Listener.class)
public class Scenario001 extends WebDriverFactory {

	@Test
	public void verifyTryAnotherText() throws IOException{
	
		Page001 pageOne = new Page001();
		
		pageOne.clickOnGroupLink();
		pageOne.clickOnLetterA();
		pageOne.enterSecurityCheckText("abc");
		
	}
	
}
