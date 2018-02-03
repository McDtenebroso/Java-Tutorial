package com.pluralsight;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverDemo {

	public static void main(String[] args) throws Exception {
		
			//WebDriver driver = new FirefoxDriver();
			//WebDriver driver = new ChromeDriver();
		
			WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
			driver.get("http://www.google.com");
			
			WebElement  searchField = driver.findElement(By.id("lst-ib"));
			searchField.sendKeys("Pluralsight");
			searchField.submit();
			
			// Implicit Wait
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			// Explicit Wait
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));
			
			WebElement imagesLink = driver.findElement(By.linkText("Images"));
			imagesLink.click();
			
			WebElement imageElement = driver.findElement(By.cssSelector("a[class = rg_l]"));
			WebElement imageLink = imageElement.findElement(By.tagName("img"));
			imageLink.click();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				driver.close();
			}
	}

}
;