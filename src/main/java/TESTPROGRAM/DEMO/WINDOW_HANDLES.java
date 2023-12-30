package TESTPROGRAM.DEMO;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WINDOW_HANDLES {

	public static void main (String argy[]) throws InterruptedException
		{
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		 Thread.sleep(2000);
		 driver.findElement(By.id("newWindowBtn")).click();
		 String parentHandle = driver.getWindowHandle();
		 Set<String> childHandles = driver.getWindowHandles();
		 
		 for(String handle : childHandles)
		 {
			 if(!handle.equals(parentHandle))
			 {
				 driver.switchTo().window(handle);
				 driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[1]/div[2]/div[1]/div[1]/div/div[1]/article/div/div/div/input[1]")).sendKeys("TAHIR BUTT");
				 driver.switchTo().window(parentHandle);
				 driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("QA AUTOMATION COURSE");
			 }
		 }
		 
		 System.out.println(childHandles);
		 //driver.quit();
		}
	
}
