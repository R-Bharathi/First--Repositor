package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swiggySignUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("mobile")).sendKeys("7780515915");
		driver.findElement(By.id("name")).sendKeys("Bharathi");
		driver.findElement(By.id("email")).sendKeys("Bharathiramakkagari@gmail.com");
		driver.findElement(By.linkText("CONTINUE")).click();
		driver.quit();
		

	}

}
