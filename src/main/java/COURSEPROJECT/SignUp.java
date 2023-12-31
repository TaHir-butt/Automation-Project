package COURSEPROJECT;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp {

	public void userSignUp() throws InterruptedException, AWTException 
	{
		//Driver initialization
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Site login
		driver.findElement(By.id("signin2")).click();
		Thread.sleep(2000);
		
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		
		Set<String> childHandles = driver.getWindowHandles();
		System.out.println(childHandles); 
		
		driver.findElement(By.cssSelector("#sign-username")).sendKeys("NewTestUser1234");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#sign-password")).sendKeys("tahir123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		
		new WebDriverWait(driver, Duration.ofSeconds(60)).ignoring(NoAlertPresentException.class).until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("login2")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("loginusername")).sendKeys("NewTestUser1234");
		driver.findElement(By.id("loginpassword")).sendKeys("tahir123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a/img")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(2000);
		
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#cartur")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#name")).sendKeys("test");
		driver.findElement(By.cssSelector("#country")).sendKeys("PAK");
		driver.findElement(By.cssSelector("#city")).sendKeys("Lahore");
		driver.findElement(By.cssSelector("#card")).sendKeys("123456789034567");
		driver.findElement(By.cssSelector("#month")).sendKeys("12");
		driver.findElement(By.cssSelector("#year")).sendKeys("2023");
		
		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
	}

	
}
