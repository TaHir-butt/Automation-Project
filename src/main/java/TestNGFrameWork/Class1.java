package TestNGFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 {

	@Test
	public void myFirstTest() throws InterruptedException 
	{
				System.out.println("First method Class1");
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
	}
	
	@Test
	public void secondFirstTest() 
	{
		System.out.println("Second method Class1");
	}
	
}
