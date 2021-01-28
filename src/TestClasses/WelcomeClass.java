package TestClasses;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.Home;
import Library.Global;

public class WelcomeClass {

	static WebDriver driver;
   
	public static void main(String[] args) {
		
		  System.out.println("setting the driver path");
		  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"resources/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://automationpractice.com/index.php");
		  driver.manage().deleteAllCookies();
	      driver.manage().window().maximize();
	      
        //TC2 – Repeat TC1 adding the following criteria:
        for(int i = 0; i<=2; i++)
        {
        	  Home.textBox_search(driver);
              Home.BtnSearch(driver);
              Global.scroll(driver);
              Home.HoverOverImage(driver);
              Home.BtnAddToCart(driver);
              Home.BtnContinueShopping(driver);
              Home.Clear_search(driver);
        }
        Home.cart_block_list(driver);
             
      ;
	}

}
