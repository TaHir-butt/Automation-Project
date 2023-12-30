package TESTPROGRAM.DEMO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lecture4 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver1 = new FirefoxDriver();
        try {
            driver1.navigate().to("https://linkedin.com/");
            driver.navigate().to("https://linkedin.com/");
            Thread.sleep(5000);
        } finally {
           // driver.quit();
            
        }
	}
	
	
}
