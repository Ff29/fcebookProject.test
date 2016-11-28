package com.facebookProject.fcebookProject.test;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import ru.yandex.qatools.allure.annotations.Attachment;

public class Util {

	@Attachment("Page Screenshot")
	protected static void getScreenshot() throws IOException{
		
		File src = ((TakesScreenshot)WebDriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("ScreenShot(Date_Time) (" + dateAndTime() + ").jpg"));
	}
	
	
	private static String dateAndTime() {
		
		String dateFormat = new SimpleDateFormat("MM_dd_yyyy_HHmmss").format(Calendar.getInstance().getTime());
		return dateFormat;
	}	
	
	public static void scrollDown() throws InterruptedException{
		
		JavascriptExecutor js = (JavascriptExecutor)WebDriverFactory.getDriver();
		js.executeScript("window.scrollBy(0,9000)");
		Thread.sleep(10000);
	}

	public static void waitOn(){
		
		WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	}
	
}

	
