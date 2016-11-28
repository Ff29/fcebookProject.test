package com.facebookProject.fcebookProject.test;
import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.facebookProject.fcebookProject.test.Page001;
import com.facebookProject.fcebookProject.test.WebDriverFactory;

@Listeners(Listener.class)
public class Scenario002 extends WebDriverFactory{

	@Test
	public void categoryListOfEntertainment() throws IOException{
		
		Page001 pageOne = new Page001();
		pageOne.clickOnCreateAPage();
		pageOne.clickOnEntertainment();
		//pageOne.clickOnCategory();
		pageOne.listOfEntertainment();
		
	}
}
