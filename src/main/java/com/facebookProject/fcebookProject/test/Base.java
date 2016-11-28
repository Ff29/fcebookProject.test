package com.facebookProject.fcebookProject.test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Base {

	protected  void enterDataIntoTextField(By locator, String input) throws IOException {
		
		try {
			
			WebDriverFactory.getDriver().findElement(locator).sendKeys(input);
			
		} catch (NoSuchElementException e) {
			
			Util.getScreenshot();
			e.printStackTrace();
			throw new NoSuchElementException("Specified Text field for input is not found");
		}
	}
	
	protected void verifyTitleOfAPage(String expectedTitle){
		
		String actualTitle = WebDriverFactory.getDriver().getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	protected void verifyErrorMessage(By locator , String expectedMessage ) throws IOException{
	
		try {
			String actualMessage = WebDriverFactory.getDriver().findElement(locator).getText();
			
			Assert.assertEquals(actualMessage, expectedMessage);
		} catch (NoSuchElementException e) {
			Util.getScreenshot();
			e.printStackTrace();
		}
		
	}
	
	protected void verifyTextIsNotSame(By locator , String expectedText){
		
		String actualText = WebDriverFactory.getDriver().findElement(locator).getText();
		
		Assert.assertNotEquals(actualText, expectedText);
		
	}
	
	
	protected int autoCompleteListIndex(List<WebElement> list, String input){
		
		for(WebElement element : list){
			System.out.println(element.getText());
			if(element.getText().equals(input)){
				return list.indexOf(element);
			}
		}
		return 0;
	}
	
	protected void autoCompleteSearchAndClick(By locator, String input){
		List<WebElement> list = WebDriverFactory.getDriver().findElements(locator);
		int indexNumber = autoCompleteListIndex(list, input);
		list.get(indexNumber).click();
	}
	
	
	
	protected void clickOn(By locator) throws IOException{
		
		try {
			
			WebDriverFactory.getDriver().findElement(locator).click();
			
		} catch (NoSuchElementException e) {
			
			Util.getScreenshot();
			e.printStackTrace();
			throw new NoSuchElementException("Specified button for click is not found");
		}
		
	}
	
	
	protected void putTab(By locator){
		
		WebDriverFactory.getDriver().findElement(locator).sendKeys(Keys.TAB);
		
	}
	
	protected static void hoverOver(By locator1,By locator2) throws InterruptedException {
		WebDriverFactory.getDriver().manage().window().maximize();
		WebElement element = WebDriverFactory.getDriver().findElement(locator1);

		Actions action = new Actions(WebDriverFactory.getDriver());
		action.moveToElement(element).build().perform();
		WebDriverFactory.getDriver().findElement(locator2).click();
	}
	
	protected static void switchToWidnow(int index) {

		List<String> listOfWindows = new ArrayList<String>(WebDriverFactory.getDriver().getWindowHandles());
		WebDriverFactory.getDriver().switchTo().window(listOfWindows.get(index));
	}
	
	
	protected static void switchToRootWindowAndCloseCurrentBrowser() {
		List<String> listOfWindows = new ArrayList<String>(WebDriverFactory.getDriver().getWindowHandles());
		
		for(int i = 1; i < listOfWindows.size(); i++){
			WebDriverFactory.getDriver().switchTo().window(listOfWindows.get(i));
			WebDriverFactory.getDriver().close();
		}
		WebDriverFactory.getDriver().switchTo().window(listOfWindows.get(0));	
	}
	
	protected void dropDownFindAndSelect(By locator,String input){
		
		Select dropDown = new Select(WebDriverFactory.getDriver().findElement(locator));
		
// 		Select element by visible text 
//		dropdown.selectByVisibleText("Jan");
		
//		Select element by index
//		dropdown.selectByIndex(3);

		List<WebElement> listOfAllOptions = dropDown.getOptions();
		for(WebElement element : listOfAllOptions){
	        if(element.getText().equals(input)) {
	            //System.out.println("January Was found in Dropdown ");
	        	element.click();
	            break;
	        }else {
	        	Assert.fail("Specefied element was not found in dropdwon");
	        }
		}
		
	}
	
	
	
	protected void dropDownListSize(By locator){
		
		//Select dropDown = new Select(WebDriverFactory.getDriver().findElement(locator));
		
		List<WebElement> dropDown = WebDriverFactory.getDriver().findElements(locator);
		//List<WebElement> listOfAllOptions = dropDown.getOptions();
		int size = dropDown.size();
		System.out.println(size + " categories are listed");
		
		System.out.println("The "+ size +" categories are: ");
		for(WebElement element : dropDown){
			//String elementList = element.getText();
			System.out.println(element.getText());
		}
	}
	
	
	protected void radioButtonCheckAndSelect(By locator) throws InterruptedException, IOException{
		
			
			try {
			
				boolean isSelcted= WebDriverFactory.getDriver().findElement(locator).isSelected();
			
				if(isSelcted==false){
				
				WebDriverFactory.getDriver().findElement(locator).click();
				Thread.sleep(3000);
				
				}else{
				
				throw new NoSuchElementException("It can not be checked by default");
				}
			
			} catch (NoSuchElementException e) {
			
			Util.getScreenshot();
			e.printStackTrace();
		}
	}
	
}
