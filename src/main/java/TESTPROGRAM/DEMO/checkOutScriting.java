package TESTPROGRAM.DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// Child Class

public class checkOutScriting {

	public void checkOut() throws InterruptedException 
	{
		//Driver initialization
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Site login
		driver.findElement(By.id("user-name")).sendKeys("visual_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);

		//Add Item to Cart
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
		Thread.sleep(2000);
		
		//Go to Cart
		driver.findElement(By.className("shopping_cart_link")).click();
		
		//Checkout
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		
		// Add info
		driver.findElement(By.id("first-name")).sendKeys("test");
		driver.findElement(By.id("last-name")).sendKeys("user");
		driver.findElement(By.id("postal-code")).sendKeys("34567");
		
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		
		// Finish the order and go back to homepage
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("back-to-products")).click();
		
		driver.close();
		
	}

}
