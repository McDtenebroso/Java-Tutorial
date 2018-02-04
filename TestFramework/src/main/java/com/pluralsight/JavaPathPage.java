package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class JavaPathPage extends PathPage {

	@FindBy(how = How.CSS, using = ".large-7 > h1:nth-child(2)")
	WebElement pageElement;
	
	@Override
	public void goTo() {
		WebElement element = Browser.driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[4]/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div[74]/a/div/div[2]")); 
		Browser.scrollIntoView(element);
		element.click();
		
	}

	@Override
	public String pathName() {
		return pageElement.getText();
	}

	
	
}
