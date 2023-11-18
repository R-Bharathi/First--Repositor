package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("bharathiramakkagari@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("12345678");
		driver.findElement(By.id("RememberMe")).click();		
		driver.findElement(By.className("Login-button")).click();
	}

}
