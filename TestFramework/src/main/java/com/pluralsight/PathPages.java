package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PathPages {

	static String url = "https://www.pluralsight.com/paths/";
	static String title = "Java Programming Learning Path | Pluralsight";
	
	public void goTo() 
	{
			Browser.goTo(url);
	}

	public PathPage getPathPage(String page)
	{
		switch (page) {
		case "Java":
				return Pages.javaPathPage();
		}
		
		return null;
	}
	
	
	public boolean isAt() {
			return Browser.title().equals(title); 
	}

}
