package com.pluralsight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverRadioButtons {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Keenum/workspace/Java-Tutorial/WebDriverDemo/src/main/webapp/RadioButtonTest.html");
		
		List<WebElement> radioButtons = driver.findElements(By.name("color"));
		
		for (WebElement radioButton : radioButtons)
		{
			if (radioButton.isSelected())
			{
				System.out.println(radioButton.getAttribute("value"));
			}
		}
		radioButtons.get(1).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			driver.close();
		}
		
	}
}
