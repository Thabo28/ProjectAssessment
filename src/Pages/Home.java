package Pages;

import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Library.Global;

public class Home {
	
	public static WebElement element= null;
	Actions action;
	
	public Home(WebDriver driver) {
		action  = new Actions(driver);
	}

	public static void textBox_search(WebDriver driver) {	
		
		  WebElement inputSearch = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
	      inputSearch.sendKeys("Dress");
	}
	
	public static void BtnSearch(WebDriver driver) {
		
		 WebElement btnSearch = driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
		 btnSearch.click();
		
	}
		
	public static void BtnAddToCart(WebDriver driver) {
		
		WebElement btnAddToCart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[4]/div/div[2]/div[2]/a[1]/span"));
	    btnAddToCart.click();
	
	}
	
	public static void BtnContinueShopping(WebDriver driver) {
		System.out.println("Test");
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement btnContinue = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span"));
		btnContinue.click();
	}
	
	public static void Clear_search(WebDriver driver) {
		
		System.out.println("Clear search");
		WebElement clearSearch = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
		clearSearch.clear();
	}
	
	public static void cart_block_list(WebDriver driver) {
		
		List<WebElement> cartList=driver.findElements(By.className("cart-info"));
		List<String> ConvertedStringsList = new ArrayList<String>();
				for(WebElement e : cartList){
					ConvertedStringsList.add(e.getText());
				}
		
		String cartListCommaSeparated = String.join(",", ConvertedStringsList);

		System.out.println(cartListCommaSeparated);

	}
	
	public static void ViewCart(WebDriver driver) {
		
		WebElement viewCart = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
		viewCart.click();
	}
	
	public static void HoverOverImage(WebDriver driver) {
		   
		Global objSearch = new Global(driver);
		WebElement searchImage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[4]/div/div[1]/div/a[1]/img"));
	    objSearch.perfomMouseOver(searchImage);
	}

}
