package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoWebShop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoapps.qspiders.com/");
		
		Actions act=new Actions(driver);
		//WebElement element=driver.findElement(By.xpath("//li[text()='With placeholder']"));
		WebElement element=driver.findElement(By.xpath("//li[text()='Multiline Text Area']"));
		act.moveToElement(element).perform();
		
	}

}
