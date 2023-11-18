package SelectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSingleDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///D:/bharathi/demo.html");
		WebElement dropdown=driver.findElement(By.id("single"));
		Select se=new Select(dropdown);
		se.selectByIndex(0);
		Thread.sleep(2000);
		se.selectByValue("3");
		Thread.sleep(2000);
		se.selectByVisibleText("sql");
		Thread.sleep(2000);
        se.deselectAll();		
		
	}

}
