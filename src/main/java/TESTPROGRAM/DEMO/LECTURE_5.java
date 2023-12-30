package TESTPROGRAM.DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LECTURE_5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://petstore.octoperf.com/actions/Account.action;jsessionid=33412D9DBB5CF4FF433188A834D0100C?signonForm");
		
		//Relative XPath 
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Tahir");
		
		//Absolute XPath
		driver.findElement(By.xpath("/html/body/div[2]/div/form/p[2]/input[2]")).sendKeys("test@.com");
		
		//By Name
		driver.findElement(By.name("keyword")).sendKeys("TEST");
		
		//By Partial Link Text
		driver.findElement(By.partialLinkText("Register")).click();
		
		//driver.quit();
		/*driver.get("https://demo.applitools.com/app.html");
		// xPath Example:
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/input")).sendKeys("AUTOMATION COURSE");
		
		// CSS Selector Example: tag.ClassName
		driver.findElement(By.cssSelector("a.btn.btn-primary")).click();*/

	}

}
