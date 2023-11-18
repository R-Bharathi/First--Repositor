package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAndDoubleClickElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoapps.qspiders.com/button");
		
		WebElement element=driver.findElement(By.xpath("//p[contains(text(),'Are you satisfied ')]/..//button[text()='No']"));
		Actions act=new Actions(driver);
		//act.moveToElement(element).doubleClick().perform();
		act.doubleClick(element).perform();
		
		
		
		
	}
	

}
