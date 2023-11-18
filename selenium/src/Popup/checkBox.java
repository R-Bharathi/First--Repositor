package Popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoapps.qspiders.com/alert");
		driver.findElement(By.xpath("//a[text()='With checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Open alert']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='×']")).click();
		//driver.findElement(By.xpath("//button[text()='close']")).click();
		
	}

}
