package com.pluralsight;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class UnitTest {
	
  @Test
  public void canGoToHomePage()
  {
	  		Pages.homePage().goTo();
	  		Assert.assertTrue(Pages.homePage().isAt());
  }
  
  
  @Test
  public void canGotoJavaPathPage()
  {
	  	Pages.pathPages().goTo();
	  	PathPage pathPage  = Pages.pathPages().getPathPage("Java");
	  	pathPage.goTo();
	  	Assert.assertTrue(pathPage.isAtPathPage("Java"));
  }
  
  @AfterClass
  public static void cleanUp()
  {
	  		Browser.close();
  }
  
}
