package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/LoginPage.html");
		//driver.findElement(By.linkText("forgot password")).click();
		driver.findElement(By.partialLinkText("for")).click();
		

	}

}
