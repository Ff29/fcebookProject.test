package com.facebookProject.fcebookProject.test;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Page001 extends Base {

	By groupLinkField = By.linkText("Groups");
	By categoryLetterAField = By.linkText("A");
	By actualTextField = By.id("captcha");
	By createAPageField = By.linkText("Create a Page");
	By entertainmentField = By.id("entertainment");
	By categoryBoxField = By.id("category");
	By listOfCategoryField = By.id("option");
	By cookiesLinkField = By.linkText("Cookies");
	By howToControlCookiesField = By.linkText("How can you control Facebook’s use of cookies to show you ads?");
	By ifHaveFbAccountField = By.linkText("If you have a Facebook Account:");
	By adSettigsLinkField = By.linkText("ad settings");
	By showMoreLanguageField = By.xpath("//a[@class='_42ft _4jy0 _517i _517h _51sy']");
	By westernEuropeLanguageField = By.linkText("Western Europe");
	By westernEuropeLanguageListField = By.xpath("//div[@id='intl-region-container'][@class='selected-intl-region6']");
	By adChoicesLinkField = By.xpath("//a[@class='_41ug']");
	By poilicesAndReportingField = By.xpath("//div[@id='u_0_1a']");
	By tradeMarkField = By.xpath("//a[@id='u_0_w']");
	By careerField = By.linkText("Careers");
	By benefitField = By.linkText("Benefits");
	By authenticSelfVideoField = By.xpath("//div[@class='_4piv']");
	By helpField = By.linkText("Help");
	By helpSearchBoxField = By.id("hc_search_input");
	By helpSearchBoxAnswerListField = By.id("js_2q");
	By gamesLinkField = By.linkText("Games");
	By platformField = By.xpath("//a[@class='_p _55pi _5vto _55_p _2agf _4jy0 _4jy3 _517h _51sy _42ft']");
	By platformListField = By.xpath("//ul[@class='_54nf']");
	By androidField = By.linkText("Android");
	By casinoLinkField = By.linkText("Casino");
	By bingoLinkField = By.linkText("Bingo");
	By bingoGamesList = By.xpath("//div[@class='_5bhc']");
	By emailField = By.id("email");
	By passwordField = By.id("pass");
	By logInButtonField = By.id("loginbutton");
	By invalidLoginErrorMessageField = By.xpath("//div[@class='_4rbf _53ij']");
	By helpLinkField = By.linkText("Help");
	By visitHelpCommunityField = By.xpath("//a[@href='/help/community']");
	By emojiLinkField = By.xpath("//div[@class='_1gbt _1gbp']");
	By commentBoxField = By.xpath("//textarea[@class='uiTextareaNoResize uiTextareaAutogrow _sk7']");
	By sumbitButtonField = By.xpath("//button[@class='_42ft _4jy0 _1pr0 _sk6 _4jy3 _4jy1 selected _51sy']");
	By feedbackConfirmationMessageField = By.xpath("//div[@class='_41y'][contains(text(),'Thanks')]");
	
	
	public void clickOnGroupLink() throws IOException{
		
		clickOn(groupLinkField);
	}
	
	public void clickOnLetterA() throws IOException{
		clickOn(categoryLetterAField);
	}
	
	public void enterSecurityCheckText(String expectedText){
		
		verifyTextIsNotSame(actualTextField, expectedText);
	}
	
	public void clickOnCreateAPage() throws IOException{
		
		clickOn(createAPageField);
	}
	
	public void clickOnEntertainment() throws IOException{
		clickOn(entertainmentField);
	}
	
	
	public void listOfEntertainment(){
		
		dropDownListSize(categoryBoxField);	
	}
	
	public void clickOnCookies() throws IOException{
		
		clickOn(cookiesLinkField);
	}
	
	public void clickOnHowToControlCookies() throws IOException{
		clickOn(howToControlCookiesField);
	}
	
	public void clickOnIfHaveFbAccount() throws IOException{
		
		clickOn(ifHaveFbAccountField);
	}
	public void clickOnAdSettings() throws IOException{
		clickOn(adSettigsLinkField);
	}
	
	public void enterAdSettingsPageTitle(String expectedTitle){
		
		verifyTitleOfAPage(expectedTitle);
	}
	
	public void clickOnMoreLanguages() throws IOException{
		
		clickOn(showMoreLanguageField);
	}
	
	public void clickOnwesternEuropeLanguages() throws IOException{
		
		clickOn(westernEuropeLanguageField);
	}
	
	public void listOfWesternEuropeLanguages(){
		List<WebElement> listOfLanguages = WebDriverFactory.getDriver().findElements(westernEuropeLanguageListField);
		System.out.println("Western Europe languages are: ");
		for(WebElement element : listOfLanguages){
			//String elementList = element.getText();
			System.out.println(element.getText());
		}
	}
	
	public void clickOnAdChoicesLink() throws IOException{
		
		clickOn(adChoicesLinkField);
	}
	
	public void hoverOverToPoliciesAndTrademark() throws InterruptedException{
		
		hoverOver(poilicesAndReportingField, tradeMarkField);
	}
	
	public void verifyTrademarkPage(String expectedTitle){
		
		verifyTitleOfAPage(expectedTitle);
	}
	
	public void clickOnCareer() throws IOException{
		
		clickOn(careerField);
	}
	
	public void clickOnBenefit() throws IOException{
		
		clickOn(benefitField);
	}
	public void clickOnAuthenticSelfVideo() throws IOException{
		
		clickOn(authenticSelfVideoField);
	}
	
	public void clickOnHelp() throws IOException{
		
		clickOn(helpField);
	}
	
	public void enterDataInSearchBox(String input) throws IOException{
		
		enterDataIntoTextField(helpSearchBoxField, input);
		WebDriverFactory.getDriver().findElement(By.xpath("//p[@class='_3nbj']")).click();
	}

	public void clickOnGames() throws IOException{
		
		clickOn(gamesLinkField);
	}
	
	
	public void enterPlatformName(String input){
		
		WebDriverFactory.getDriver().findElement(platformField).click();
		List<WebElement> listOfPlatform = WebDriverFactory.getDriver().findElements(platformListField);
		for(WebElement element : listOfPlatform){
			System.out.println(element.getText());
		}
		WebDriverFactory.getDriver().findElement(androidField).click();
		
	}
	
	
	
	public void hoveroverToCasinoAndBingo() throws InterruptedException{
		
		hoverOver(casinoLinkField, bingoLinkField);
	}
	
	public void gamesNamedMania(String input) throws IOException{
		
		List<WebElement> listOfLanguages = WebDriverFactory.getDriver().findElements(bingoGamesList);
		System.out.println("Bingo games are: ");
		for(WebElement element : listOfLanguages){
			
			System.out.println(element.getText());
			if(element.getText().equals(input)){
				
				System.out.println(element);
				break;
			}
		}
		
		}
	
	public void enterEmail(String input) throws IOException{
		enterDataIntoTextField(emailField, input);
	}
	
	public void enterPassword(String input) throws IOException{
		enterDataIntoTextField(passwordField, input);
	}
	public void clickOnLogIn() throws IOException{
		clickOn(logInButtonField);
	}
	
	
	public void enterExpectedErrorMessage(String input) throws IOException{
		
		verifyErrorMessage(invalidLoginErrorMessageField, input);
	}
	
	public void clickOnvisitHelpCommunity() throws IOException{
		
		clickOn(visitHelpCommunityField);
	}
	
	public void clickOnEmoji() throws IOException{
		
		clickOn(emojiLinkField);
	}
	
	public void enterComment(String input) throws IOException{
		
		enterDataIntoTextField(commentBoxField, input);
	}
	
	public void clickOnSubmitButton() throws IOException{
		clickOn(sumbitButtonField);
	}
	
	public void vrifyConfirmationMessage(String expectedMessage) throws IOException{
		
		verifyErrorMessage(feedbackConfirmationMessageField, expectedMessage);
	}
}

	

