package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQDragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoapps.qspiders.com/dragDrop");
		
		WebElement src=driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement destination=driver.findElement(By.xpath("//div[text()='Mobile Accessories']/.."));
		Actions act=new Actions(driver);
		//act.dragAndDrop(src, destination).perform();
		//act.clickAndHold(src).release(destination).perform();
		act.moveToElement(src).clickAndHold().release(destination).perform();
	}
	

}
