package TestClasses;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCorrectPage {
  static WebDriver driver;
      
	  @Test
	  public void TestBrowser()
	  {
		  System.out.println("setting the driver path");
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"resources/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();

	        driver.get("http://automationpractice.com/index.php");
	        driver.manage().window().maximize();
	        
	        String actualTitle = driver.getTitle();
	        String expectedTitle = "My Store";
	        System.out.println(actualTitle);
	      
	      //d. Verify the correct page has loaded.
	        Assert.assertEquals(actualTitle, expectedTitle);
	        System.out.println("The titles are same");
	  }
	 
}
