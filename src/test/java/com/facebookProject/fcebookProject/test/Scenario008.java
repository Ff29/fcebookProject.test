package com.facebookProject.fcebookProject.test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class Scenario008 extends WebDriverFactory {

	@Test
	public void listOfGamesNamedMania() throws IOException, InterruptedException{
		Page001 pageOne = new Page001();
		
		pageOne.clickOnGames();
		pageOne.enterPlatformName("Android");
		pageOne.hoveroverToCasinoAndBingo();
		pageOne.gamesNamedMania("Bingo Mania");
	}
}
