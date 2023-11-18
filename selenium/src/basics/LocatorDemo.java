package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("file:///D:/LoginPage.html");
		driver.findElement(By.id("username")).sendKeys("im selenium");
		driver.findElement(By.name("password")).sendKeys("this is java");
		driver.findElement(By.className("cpassword")).sendKeys("this is manual");
		driver.findElement(By.tagName("a")).click();
		
		
		
		
        
	}

	

}
