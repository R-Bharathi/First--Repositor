package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterForDemoUsingWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Ramakkagari");
		WebElement element= driver.findElement(By.id("LastName"));
		element.sendKeys("reddy");
		Thread.sleep(3000);
		element.clear();
		element.sendKeys("Bharathi");
		driver.findElement(By.id("Email")).sendKeys("bharathiramakkagari@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Password")).sendKeys("7892653");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("7892653");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}
