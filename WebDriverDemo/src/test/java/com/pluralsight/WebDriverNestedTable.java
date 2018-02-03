package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverNestedTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Keenum/workspace/Java-Tutorial/WebDriverDemo/src/main/webapp/NestedTableTest.html");
		
		WebElement outerTable= driver.findElement(By.tagName("table"));
		WebElement innerTable = outerTable.findElement(By.tagName("table"));
		WebElement row = innerTable.findElements(By.tagName("td")).get(1);
		System.out.println("TagName: " + row.getText());
		
		WebElement rowXPath = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[1]/td"));
		System.out.println("XPath: " + rowXPath.getText());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			driver.close();
		}
	}

}
