package TESTPROGRAM.DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WINDOW_FRAMES {

	public static void main(String argu []) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
				
		driver.get("https://blogpendingtasks.blogspot.com/");
		driver.switchTo().frame("navbar-iframe");
		driver.findElement(By.xpath("//*[@id=\"b-query\"]")).sendKeys("TEST SEARCH");
	} 
}
