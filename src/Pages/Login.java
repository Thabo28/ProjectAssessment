package Pages;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Library.Global;

public class Login {

	public static WebElement element= null;
	public static void main(String[] args) {

		System.out.println("setting the driver path");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //TC4 – Sign into the website using a username and password stored as a global variable.
        System.setProperty("jmotariana@gmail.com","Passw0d123");
        
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        
        BtnMainSignIn(driver);
        Global.scroll(driver);
        Username(driver);
        Password(driver);
        BtnSignIn(driver);
        
	}
    public static void BtnMainSignIn(WebDriver driver) {
		
		 WebElement btnMainSignIn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		 btnMainSignIn.click();
	}
	public static void Username(WebDriver driver) {
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		username.sendKeys("jmotariana@gmail.com");
	}
	public static void Password(WebDriver driver) {
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		password.sendKeys("Passw0d123");
	}
public static void BtnSignIn(WebDriver driver) {
	
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 WebElement btnSignIn = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]"));
	 btnSignIn.click();
	}
	


}
