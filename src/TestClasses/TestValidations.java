package TestClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.Cart;
import Library.Global;
import Library.Browser;

public class TestValidations {

	 
	  static WebDriver driver;
      
	  @Test
	  public void TestBrowser()
	  {
		    Browser.invokeBrowers();
	        String actualTitle = driver.getTitle();
	        String expectedTitle = "My Store";
	        
	      //TC1 - Navigate to http://automationpractice.com/ perform a search and verify the first result matches your search criteria.
	        Assert.assertEquals(actualTitle, expectedTitle);
	        System.out.println("The titles are same");
	  }
	 
	  @Test
	  public static void TestCal1()
	  {
		  double actualTotal = 65.6;
		  double expectedTotal = Cart.Calc();
		 
		//e. Verify displayed total matches calculated total.	
		  Assert.assertEquals(actualTotal, expectedTotal, "test message ");;
		  System.out.println("Total is correct");
		  Global.quitBrowser(driver);
	  }
	  
	 
	 

}
