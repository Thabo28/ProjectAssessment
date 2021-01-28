package Pages;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Library.Global;
//TC5 – This test case needs to have the following steps:
public class Cart {

	public static void main(String[] args) {
		
		System.out.println("setting the driver path");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
       
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        
        Home.textBox_search(driver);
        Home.BtnSearch(driver);
        Global.scroll(driver);
        Home.HoverOverImage(driver);
        
        //a. Add an item to shopping your cart.
        Home.BtnAddToCart(driver);
        
        Home.BtnContinueShopping(driver);
        Global.scrollUpDrv(driver);
        
        //b. View shopping cart.
        Home.ViewCart(driver);
        Global.scroll(driver);
        
      //c. Increase quantity to a desired amount.
        IncreaseQuantity(driver);
        
        Calc();

	}
	public static void IncreaseQuantity(WebDriver driver) {
		
		WebElement increaseQuantity = driver.findElement(By.xpath("//*[@id=\"cart_quantity_up_7_34_0_0\"]/span/i"));
		for(int i = 0; i < 3; i++)
		{
			increaseQuantity.click();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
	}
	//d. Calculate total (unit price x quantity): You will need to create a custom
			//method/keyword that does the following:
			//i. Accepts 2 variables "unit price, quantity".
			//ii. Calculates and returns the result.
	
	public static double Calc()
	{
		double unitPrice = 16.40;
		double quantity = 4;
		double total = unitPrice * quantity;
		System.out.println("total = " + total);
		return total;
		
	}
	
}
