package WebElements;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickClearAndSendkeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/jewelry");
	     WebElement element=driver.findElement(By.id("small-searchterms"));
	     element.sendKeys("123");
	     Thread.sleep(1000);
	     element.clear();
	     element.sendKeys("abc");
	     Thread.sleep(1000);
	     
	     
	     
	}

}
