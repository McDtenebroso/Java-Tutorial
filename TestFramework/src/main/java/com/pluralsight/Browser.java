package com.pluralsight;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	static WebDriver driver = new FirefoxDriver();
	
	public static void goTo(String url)
	{
		driver.get(url);
	}

	public static String title() {
		return driver.getTitle();
	}
	
	public static void scrollIntoView(WebElement element)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void close() {
		driver.close();		
	}
	
}
