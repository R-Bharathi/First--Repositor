package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitSyn {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     
     driver.get("https://www.instagram.com");
     
     
     driver.findElement(By.name("username")).sendKeys("bharathi");
     
     
     
     
     
     
     
     
	}

}
