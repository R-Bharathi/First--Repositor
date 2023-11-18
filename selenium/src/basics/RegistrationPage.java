package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Ramakkagari");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("bharathi");
		Thread.sleep(2000);
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
